package com.mrmaycs.cvcgames.client;

import javax.swing.*;
import java.awt.*;

/**
 * Round Rock Tech Apps 2017
 */
public class Chatbox extends JPanel {
    private JTextArea chatTextArea;
    private JTextField entryTextField;

    public Chatbox() {
        chatTextArea = new JTextArea();
        entryTextField = new JTextField();

        //TODO: Tinker with this to make it responsive
        chatTextArea.setRows(6);
        chatTextArea.setColumns(20);
        chatTextArea.setEditable(false);
        entryTextField.setColumns(20);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(chatTextArea);
        this.add(entryTextField);
    }

    public static GridBagConstraints getConstraints() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.anchor = GridBagConstraints.SOUTHWEST;
        return constraints;
    }
}
