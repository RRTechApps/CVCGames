package com.mrmaycs.cvcgames.game;

import java.awt.*;

/**
 * Round Rock Tech Apps 2017
 */
public class TiledGameBoard extends GameBoard {
    public TiledGameBoard(Color primary, Color secondary, int rows, int cols) {
        super(new Color[] {primary, secondary}, rows, cols);
    }

    @Override
    public void drawBoard(Graphics g, int width, int height) {
        g.setColor(this.colors[0]);
        g.drawRect(0, 0, width, height);
    }

    @Override
    public Dimension getMinimumSize() {
        return null;
    }
}
