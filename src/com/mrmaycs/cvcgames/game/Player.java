package com.mrmaycs.cvcgames.game;


import java.util.ArrayList;
import java.util.List;

/**
 * Round Rock Tech Apps 2017
 *
 * This class represents a single player in a game
 *
 */

public class Player {
    private int score;
    private String name;
    private List<GamePiece> gamePieces;

    public Player(String name) {
        this.name = name;
        this.gamePieces = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void incScore(int amt) {
        this.score += amt;
    }

    public boolean addPiece(GamePiece piece) {
        return gamePieces.add(piece);
    }

    public boolean removePiece(GamePiece piece) {
        return gamePieces.remove(piece);
    }
}
