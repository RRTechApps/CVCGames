package com.mrmaycs.cvcgames.game.checkers;

import com.mrmaycs.cvcgames.game.GamePiece;
import com.mrmaycs.cvcgames.game.Player;
import com.mrmaycs.cvcgames.game.Position;
import com.mrmaycs.cvcgames.game.TiledGame;

/**
 * Round Rock Tech Apps 2017
 *
 * This class represents the game of checkers using TiledGame
 *
 */
public class Checkers extends TiledGame {
    @Override
    public void init() {

    }

    @Override
    public boolean isValidMove(GamePiece piece, Position triedMove) {
        return false;
    }

    @Override
    public Player isGameOver() {
        return null;
    }

    @Override
    public Position getDefaultPosition(Player player) {
        return null;
    }
}
