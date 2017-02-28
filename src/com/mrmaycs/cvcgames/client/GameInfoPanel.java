package com.mrmaycs.cvcgames.client;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kenny on 27/02/2017.
 */
public class GameInfoPanel extends JPanel {

    public GameInfoPanel() {
    }

    public static GridBagConstraints getConstraints() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.NORTHWEST;
        return constraints;
    }
}
