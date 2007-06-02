package bnubot.bot.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import bnubot.core.ConnectionSettings;

@SuppressWarnings("serial")
public class ConfigurationFrame extends JDialog {
	ConnectionSettings cs;
	
	JTextArea txtUsername = null;
	JPasswordField txtPassword = null;
	JTextArea txtEmail = null;
	JComboBox cmbProduct = null;
	JTextArea txtTrigger = null;
	JTextArea txtAntiIdle = null;
	JTextArea txtCDKey = null;
	JTextArea txtCDKeyLOD = null;
	JTextArea txtCDKeyTFT = null;
	JTextArea txtBNCSServer = null;
	JTextArea txtBNLSServer = null;
	JTextArea txtChannel = null;
	JCheckBox chkAutoConnect = null;
	JCheckBox chkEnableGUI = null;
	JCheckBox chkEnableCLI = null;
	JCheckBox chkPacketLog = null;
	JButton btnLoad = null;
	JButton btnSave = null;
	JButton btnCancel = null;
	
	private class ConfigTextArea extends JTextArea {
		public ConfigTextArea(String text) {
			super(text);
			setBorder(BorderFactory.createEtchedBorder());
		}
	}
	
	public ConfigurationFrame(ConnectionSettings cs) {
		super();
		
		this.cs = cs;

		initializeGui();
		setupActions();
		setTitle(cs.username);
		pack();
	}
	
	private void initializeGui() {
		Box boxAll = new Box(BoxLayout.Y_AXIS);
		{
			JPanel pnlSettings = new JPanel(new GridLayout(0, 2));
			{
				pnlSettings.add(new JLabel("Username"));
				txtUsername = new ConfigTextArea(cs.username);
				pnlSettings.add(txtUsername);
				
				pnlSettings.add(new JLabel("Password"));
				txtPassword = new JPasswordField(cs.password);
				pnlSettings.add(txtPassword);
				
				pnlSettings.add(new JLabel("Email"));
				txtEmail = new ConfigTextArea(cs.email);
				pnlSettings.add(txtEmail);
				
				pnlSettings.add(new JLabel("Product"));
				cmbProduct = new JComboBox(util.Constants.prods);
				cmbProduct.setSelectedIndex(cs.product - 1);
				pnlSettings.add(cmbProduct);
				
				pnlSettings.add(new JLabel("Trigger"));
				txtTrigger = new ConfigTextArea(cs.trigger);
				pnlSettings.add(txtTrigger);
				
				pnlSettings.add(new JLabel("Anti-Idle"));
				txtAntiIdle = new ConfigTextArea(cs.antiIdle);
				pnlSettings.add(txtAntiIdle);
				
				pnlSettings.add(new JLabel("CD Key"));
				txtCDKey = new ConfigTextArea(cs.cdkey);
				pnlSettings.add(txtCDKey);
				
				pnlSettings.add(new JLabel("LOD Key"));
				txtCDKeyLOD = new ConfigTextArea(cs.cdkeyLOD);
				pnlSettings.add(txtCDKeyLOD);
				
				pnlSettings.add(new JLabel("TFT Key"));
				txtCDKeyTFT = new ConfigTextArea(cs.cdkeyTFT);
				pnlSettings.add(txtCDKeyTFT);
				
				pnlSettings.add(new JLabel("Battle.net Server"));
				txtBNCSServer = new ConfigTextArea(cs.bncsServer);
				pnlSettings.add(txtBNCSServer);
				
				pnlSettings.add(new JLabel("BNLS Server"));
				txtBNLSServer = new ConfigTextArea(cs.bnlsServer);
				pnlSettings.add(txtBNLSServer);
				
				pnlSettings.add(new JLabel("Channel"));
				txtChannel = new ConfigTextArea(cs.channel);
				pnlSettings.add(txtChannel);
			}
			boxAll.add(pnlSettings);

			Box boxCheckboxes = new Box(BoxLayout.Y_AXIS);
			{
				chkAutoConnect = new JCheckBox("Auto Connect", cs.autoconnect);
				boxCheckboxes.add(chkAutoConnect);
				
				chkEnableGUI = new JCheckBox("Enable GUI", cs.enableGUI);
				boxCheckboxes.add(chkEnableGUI);
				
				chkEnableCLI = new JCheckBox("Enable CLI", cs.enableCLI);
				boxCheckboxes.add(chkEnableCLI);
				
				chkPacketLog = new JCheckBox("Packet Log", cs.packetLog);
				boxCheckboxes.add(chkPacketLog);
			}
			boxAll.add(boxCheckboxes);
			
			boxAll.add(Box.createVerticalGlue());
			
			Box boxButtons = new Box(BoxLayout.X_AXIS);
			{
				btnLoad = new JButton("Load");
				btnSave = new JButton("OK");
				btnCancel = new JButton("Cancel");
				boxButtons.add(Box.createHorizontalGlue());
				boxButtons.add(btnLoad);
				boxButtons.add(btnSave);
				boxButtons.add(btnCancel);
			}
			boxAll.add(boxButtons);
		}
		add(boxAll);
	}

	private void setupActions() {
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						load();
					}
				});
			}
		});
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						save();
						close();
					}
				});
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						cancel();
					}
				});
			}
		});
	}
	
	private String formatCDKey(String in) {
		String out = new String(in);
		out = out.replaceAll("-", "");
		out = out.replaceAll(" ", "");
		out = out.replaceAll("\t", "");
		return out.toUpperCase();
	}
	
	private void save() {
		cs.username = txtUsername.getText();
		cs.password = new String(txtPassword.getPassword());
		cs.email = txtEmail.getText();
		cs.product = (byte)(cmbProduct.getSelectedIndex() + 1);
		cs.trigger = txtTrigger.getText();
		cs.antiIdle = txtAntiIdle.getText();
		cs.cdkey = formatCDKey(txtCDKey.getText());
		cs.cdkeyLOD = formatCDKey(txtCDKeyLOD.getText());
		cs.cdkeyTFT = formatCDKey(txtCDKeyTFT.getText());
		cs.bncsServer = txtBNCSServer.getText();
		cs.bnlsServer = txtBNLSServer.getText();
		cs.channel = txtChannel.getText();
		cs.autoconnect = chkAutoConnect.isSelected();
		cs.enableGUI = chkEnableGUI.isSelected();
		cs.enableCLI = chkEnableCLI.isSelected();
		cs.packetLog = chkPacketLog.isSelected();
		
		cs.save();
	}
	
	private void load() {
		cs.load();
		txtUsername.setText(cs.username);
		txtPassword.setText(cs.password);
		txtEmail.setText(cs.email);
		cmbProduct.setSelectedIndex(cs.product - 1);
		txtTrigger.setText(cs.trigger);
		txtAntiIdle.setText(cs.antiIdle);
		txtCDKey.setText(cs.cdkey);
		txtCDKeyLOD.setText(cs.cdkeyLOD);
		txtCDKeyTFT.setText(cs.cdkeyTFT);
		txtBNCSServer.setText(cs.bncsServer);
		txtBNLSServer.setText(cs.bnlsServer);
		txtChannel.setText(cs.channel);
		chkAutoConnect.setSelected(cs.autoconnect);
		chkEnableGUI.setSelected(cs.enableGUI);
		chkEnableCLI.setSelected(cs.enableCLI);
		chkPacketLog.setSelected(cs.packetLog);
	}
	
	private void cancel() {
		load();
		close();
	}
	
	private void close() {
		String v = cs.isValid();
		if(v == null) {
			dispose();
		} else {
			JOptionPane.showMessageDialog(this, "The configuration is invalid: " + v);
		}
	}
}
