package com.mrmaycs.cvcgames.game;

/**
 * Round Rock Tech Apps 2017
 *
 * This class is for keeping the position of a game piece
 *
 */
public class Position {

    public int row, column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
