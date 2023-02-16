package org.example.Blocking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BlockingServer extends Thread {
    int clientCounter;

    public static void main(String[] args) {
        new BlockingServer().start();

    }

    @Override

    public void run() {

        try {
            ServerSocket server = new ServerSocket(8089);

            while (true) {

                Socket socket = server.accept();
                clientCounter++;
                new Conversation(socket,clientCounter).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}



