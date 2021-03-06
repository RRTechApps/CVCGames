package com.mrmaycs.cvcgames.game;

/**
 * Round Rock Tech Apps 2017
 *
 * This abstract class is for a tiled game such as chess or checkers
 *
 */
public abstract class TiledGame extends Game {
    //Initialize the GamePanel
    public abstract void init();

    //Check if a move is valid for the current player
    public abstract boolean isValidMove(GamePiece piece, Position triedMove);

    //Check if the game is over and return the player that has won
    public abstract Player isGameOver();

    //Return the default position for the player
    public abstract Position getDefaultPosition(Player player);
}
