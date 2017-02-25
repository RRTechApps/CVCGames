package com.mrmaycs.cvcgames.client;

import javax.swing.*;

/**
 * Round Rock Tech Apps 2017
 */
public class ConnectDialog extends JDialog {
    private JTextField netAddressField;
    private JLabel netAddressLabel;
    private JButton connectButton;

    public ConnectDialog() {
        //Component Initialization
        netAddressField = new JTextField();
        netAddressLabel = new JLabel("Enter IP");
        connectButton = new JButton("Connect");
        BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);

        //Setup Components in frame
        this.setLayout(layout);
        this.add(netAddressLabel);
        this.add(netAddressField);
        this.add(connectButton);

        //Finalize
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }


}
