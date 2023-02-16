package org.example.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",8089);

        InputStream is=socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br= new BufferedReader(isr);

        OutputStream os= socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os,true);
        System.out.println(br.readLine());






    }







}
