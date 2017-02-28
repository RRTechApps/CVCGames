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
    private JMenu fileMenu;
    private JMenu helpMenu;

    public ClientGUI() throws HeadlessException {
        //Component Initialization
        chatbox = new Chatbox();
        gamePanel = new GamePanel();
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        JMenuItem connect = new JMenuItem("Connect");
        JMenuItem exit = new JMenuItem("Exit");
        GridBagLayout layout = new GridBagLayout();

        //Add menu items
        fileMenu.add(connect);
        fileMenu.add(exit);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        //Setup components in frame
        this.setLayout(layout);
        GridBagConstraints menuBarConstraints = new GridBagConstraints();
        menuBarConstraints.anchor = GridBagConstraints.NORTHWEST;
        menuBarConstraints.gridx = 0;
        menuBarConstraints.gridy = 0;
        this.add(menuBar, menuBarConstraints);
        this.add(chatbox, Chatbox.getConstraints());
        this.add(gamePanel, GamePanel.getConstraints());

        //Finalize
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
