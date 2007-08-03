/**
 * This file is distributed under the GPL 
 * $Id$
 */

package net.bnubot.core.queue;

import java.util.Iterator;
import java.util.LinkedList;

import net.bnubot.core.Connection;

public class ChatQueue extends Thread {
	private LinkedList<Connection> cons = new LinkedList<Connection>();
	private LinkedList<String> queue = new LinkedList<String>();
	private int lastCon = 0;
	
	public ChatQueue() {
		this.setDaemon(true);
	}
	
	public boolean add(Connection c) {
		synchronized(cons) {
			return cons.add(c);
		}
	}
	
	public boolean enqueue(String text, boolean fp) {
		if(fp) synchronized(queue) {
			return queue.add(text);
		} else {
			if(lastCon >= cons.size())
				lastCon = 0;
			cons.get(lastCon++).sendChatNow(text);
			return true;
		}
	}
	
	public void run() {
		//TODO: flag condition for when there's a /kick or /ban but no ops are connected
		while(true) {
			// If there's text in the queue to send
			if(queue.size() > 0) {
				// Iterate through the connecitons
				Iterator<Connection> it = cons.iterator();
				while(it.hasNext()) {
					Connection con = it.next();
					// Check if the con can send text now
					if(con.canSendChat()) {
						if(!con.isOp()) {
							//Find a string we can send
							int queueIndex;
							findSendableText: for(queueIndex = 0; queueIndex < queue.size(); queueIndex++) {
								String text = queue.get(queueIndex);
								
								// Check if ops is required
								try {
									if(text.charAt(0) == '/') {
										String cmd = text.substring(1);
										int i = cmd.indexOf(' ');
										if(i != -1) {
											cmd = cmd.substring(0, i).toLowerCase();
											
											if(cmd.equals("kick")
											|| cmd.equals("ban"))
												continue findSendableText;
										}
									}
								} catch(Exception e) {}

								// Write the text out
								con.sendChatNow(queue.remove(queueIndex));
							}
						} else {
							// Write the text out
							con.sendChatNow(queue.remove());
						}
						
						// If the queue is empty, stop
						if(queue.size() == 0)
							break;
					}
				}
				
			}
			
			yield();
			try { sleep(10); } catch(Exception e) {}
		}
	}
}