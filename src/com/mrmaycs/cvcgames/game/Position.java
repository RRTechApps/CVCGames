package com.mrmaycs.cvcgames.game;

/**
 * Round Rock Tech Apps 2017
 *
 * This class is for keeping the position of a game piece
 */
public class Position {

    public int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
