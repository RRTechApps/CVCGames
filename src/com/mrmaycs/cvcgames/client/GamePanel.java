package com.mrmaycs.cvcgames.client;

import com.mrmaycs.cvcgames.game.Game;

import javax.swing.*;
import java.awt.*;

/**
 * Round Rock Tech Apps 2017
 */
public class GamePanel extends JPanel {
    private Game game;

    public GamePanel(Game game) {
        this.game = game;
    }

    public GamePanel() {
        this.game = null;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.game != null)
            this.game.getBoard().drawBoard(g, this.getWidth(), this.getHeight());
    }

    public static GridBagConstraints getConstraints() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.weightx = 5;
        constraints.weighty = 5;
        constraints.gridheight = 2;
        constraints.gridwidth = 2;
        return constraints;
    }
}
