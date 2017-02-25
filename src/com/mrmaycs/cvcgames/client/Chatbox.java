package com.mrmaycs.cvcgames.client;

import javax.swing.*;
import java.awt.*;

/**
 * Round Rock Tech Apps 2017
 */
public class Chatbox extends JPanel {
    public static GridBagConstraints getConstraints() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.weightx = 5;
        constraints.weighty = 5;
        return constraints;
    }
}
