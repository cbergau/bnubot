/**
 * This file is distributed under the GPL
 * $Id$
 */
package net.bnubot.core;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

import net.bnubot.util.BNetInputStream;

/**
 * @author scotta
 */
public class SOCKS4ProxySocket extends Socket {
	private InetAddress address;
	private final int port;

	public SOCKS4ProxySocket(
			InetAddress s4_address, int s4_port,
			InetAddress address, int port) throws IOException {
		super(s4_address, s4_port);
		this.address = address;
		this.port = port;

		init1(address, port);
		init2();
	}

	/*
	public Socks4ProxySocket(
			InetAddress s4_address, int s4_port,
			String address, int port) throws IOException {
		super(s4_address, s4_port);
		this.address = null;
		this.port = port;

		// Socks4a, send host 0.0.0.1, and then the hostname
		init1(InetAddress.getByName("0.0.0.1"), port);
		DataOutputStream dos = new DataOutputStream(getOutputStream());
		// Host
		dos.write(address.getBytes());
		dos.write(0);
		dos.flush();
		init2();
	}
	*/

	private void init1(InetAddress address, int port) throws IOException {
		DataOutputStream dos = new DataOutputStream(getOutputStream());
		// SOCKS 4
		dos.writeByte(0x04);
		// Connect
		dos.writeByte(0x01);
		// Port
		dos.writeShort(port);
		// IP
		dos.writeInt(htonl(BNetInputStream.readDWord(address.getAddress(), 0)));
		// User ID
		dos.write(0);
		dos.flush();
	}

	private void init2() throws IOException {
		InputStream is = getInputStream();
		while(isConnected() && (is.available() < 2))
			Thread.yield();

		is.read(); // null
		int result = is.read();
		switch(result) {
		case 0x5a: break; // Granted
		default:
			throw new IOException("Request not granted: " + result);
		}

		while(isConnected() && (is.available() < 6))
			Thread.yield();
		is.skip(2);
		if(this.address == null) {
			byte[] addr = new byte[4];
			if(is.read(addr) != 4)
				throw new IOException("Couldn't read address");
			this.address = InetAddress.getByAddress(addr);
		} else {
			is.skip(4);
		}
	}

	private int htonl(int hl) {
		return ((hl & 0xFF000000) >> 24)
		     | ((hl & 0x00FF0000) >> 8)
		     | ((hl & 0x0000FF00) << 8)
		     | ((hl & 0x000000FF) << 24);
	}

	@Override
	public InetAddress getInetAddress() {
		return address;
	}

	@Override
	public int getPort() {
		return port;
	}
}