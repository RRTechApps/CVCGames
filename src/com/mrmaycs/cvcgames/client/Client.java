package com.mrmaycs.cvcgames.client;

import java.io.IOException;
import java.net.Socket;

/**
 * Round Rock Tech Apps 2017
 *
 * Client that communicates with the server through a socket
 *
 */
public class Client implements Runnable {
    private boolean running;
    private Socket socket;

    public Client(String ip, int port) throws IOException {
        running = true;
        socket = new Socket(ip, port);
    }

    public void stop() {
        running = false;
    }

    public void resume() {
        running = true;
    }

    @Override
    public void run() {
        while(running) {

        }
    }
}
