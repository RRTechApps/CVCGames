package com.mrmaycs.cvcgames.client;

import javax.swing.*;
import java.awt.*;

/**
 * Round Rock Tech Apps 2017
 *
 * Swing GUI for the client
 *
 */
public class ClientGUI extends JFrame {
    private Client client;
    private Chatbox chatbox;
    private GamePanel gamePanel;
    private JMenuBar menuBar;

    public ClientGUI() throws HeadlessException {
        //Component Initialization
        chatbox = new Chatbox();
        menuBar = new JMenuBar();
        gamePanel = new GamePanel();
        GridBagLayout layout = new GridBagLayout();

        //Setup components in frame
        this.setLayout(layout);
        this.add(chatbox, Chatbox.getConstraints());
        this.add(gamePanel, GamePanel.getConstraints());

        //Finalize
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
