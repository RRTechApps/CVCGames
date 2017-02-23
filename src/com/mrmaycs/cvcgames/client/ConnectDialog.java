package com.mrmaycs.cvcgames.client;

import javax.swing.*;

/**
 * Round Rock Tech Apps 2017
 */
public class ConnectDialog extends JDialog {
    private JTextField netAddressField;
    private JLabel netAddressLabel;
    public ConnectDialog() {

        netAddressField = new JTextField();
        netAddressLabel = new JLabel("Enter IP");
    }
}
