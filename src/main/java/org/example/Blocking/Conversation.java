package org.example.Blocking;

import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;

public class Conversation extends Thread{


    private Socket socket;
    private int clientId;
    public Conversation(Socket socket,int clientId) {
        this.socket=socket;
        this.clientId=clientId;
    }

    @Override
    public void run(){

        try {

            InputStream is=socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br= new BufferedReader(isr);

            OutputStream os= socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);
            String ip=socket.getRemoteSocketAddress().toString();
            System.out.println("new client connection ====>"+clientId+" this ip"+ip);
            pw.println("Welecome !your number "+clientId);

            while(true){
          String request=br.readLine();
                System.out.println("New request ==IP"+ip+"Request ");
          String response="Size ="+request.length();







            }








        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }











}
