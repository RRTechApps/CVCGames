package com.mrmaycs.cvcgames.game;

import javax.swing.*;

/**
 * Round Rock Tech Apps 2017
 */
public class GamePiece {
    private boolean creator;
    private ImageIcon icon;
    private Player owner;
    private Position position;
    private String name;
    private TiledGame game;

    //Constructor for a creator
    public GamePiece(String name, ImageIcon icon, TiledGame game) {
        this.name = name;
        this.icon = icon;
        this.game = game;
        this.creator = true;
    }

    //Constructor used by the creator
    private GamePiece(String name, ImageIcon icon, Player owner, Position position) {
        this.name = name;
        this.icon = icon;
        this.owner = owner;
        this.position = position;
        this.creator = false;
    }

    //Create a single piece from one owner
    public GamePiece createPiece(Player owner) {
        if(!creator)
            throw new IllegalStateException("Not a creator gamepiece");
        return new GamePiece(name, icon, owner, game.getDefaultPosition(owner));
    }

    //Create multiple pieces from one owner
    public GamePiece[] createPieces(Player owner, int amount) {
        if(!creator)
            throw new IllegalStateException("Not a creator gamepiece");
        GamePiece[] pieces = new GamePiece[amount];
        for (int i = 0; i < pieces.length; i++)
            pieces[i] = new GamePiece(name, icon, owner, game.getDefaultPosition(owner));
        return pieces;
    }

    //Return the icon of the piece
    public ImageIcon getIcon() { return icon; }

    //Return the name of the game piece
    public String getName() { return name; }

    //Return the owner of the game piece
    public Player getOwner() {
        if(!creator)
            throw new IllegalStateException("Not a creator gamepiece");
        return owner;
    }

    //Return the position of the game piece
    public Position getPosition() {
        if(!creator)
            throw new IllegalStateException("Not a creator gamepiece");
        return position;
    }
}
