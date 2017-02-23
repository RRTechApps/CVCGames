package com.mrmaycs.cvcgames.game;

/**
 * Round Rock Tech Apps 2017
 */
public abstract class Game {
    protected GameBoard board;
    protected Player[] players;

    //Initialize the GamePanel
    public abstract void init();

    //Check if a move is valid for the current player
    public abstract boolean isValidMove(GamePiece piece, Position triedMove);

    //Check if the game is over and return the player that has won
    public abstract Player isGameOver();

    //Return the default position for the player
    public abstract Position getDefaultPosition(Player player);

    //Return the game board
    public GameBoard getBoard() {
        return board;
    }
}
