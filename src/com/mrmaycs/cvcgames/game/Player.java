package com.mrmaycs.cvcgames.game;


import java.util.ArrayList;
import java.util.List;

/**
 * Round Rock Tech Apps 2017
 *
 * This class represents a single player in a game
 */

public class Player {
    private String name;
    private List<GamePiece> gamePieces;

    public Player(String name) {
        this.name = name;
        this.gamePieces = new ArrayList<>();
    }
}
