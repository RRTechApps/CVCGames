package com.mrmaycs.cvcgames.game;

import java.awt.*;

/**
 * Round Rock Tech Apps 2017
 */
public abstract class GameBoard {
    protected GamePiece[][] board;
    protected Color[] colors;

    public GameBoard(Color[] colors, int rows, int cols) {
        this.board = new GamePiece[rows][cols];
        this.colors = colors;
    }

    public abstract void drawBoard(Graphics g, int width, int height);

    public abstract Dimension getMinimumSize();
}
