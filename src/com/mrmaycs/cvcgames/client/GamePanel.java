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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.game.getBoard().drawBoard(g, this.getWidth(), this.getHeight());
    }
}
