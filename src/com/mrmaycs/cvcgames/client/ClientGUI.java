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

    public ClientGUI(Client client) throws HeadlessException {
        this.client = client;

        //Component Initialization
        chatbox = new Chatbox();

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
    }
}
