/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author sandr
 */
public class SimpleDayTimeServer {
    public static void main(String[] args) {
        try {
            int port = Integer.parseInt(args[0]);
            ServerSocket listen = new ServerSocket(port);
            while (true) {
                System.out.println("Waiting for connection on port " +
                listen.getLocalPort() + "...");
                try (Socket client = listen.accept()) {
                    System.out.println("Connection to " +
                            client.getInetAddress());
                    DataOutputStream dout =
                            new DataOutputStream(client.getOutputStream());
                    Date date = new Date();
                    dout.write((date.toString()).getBytes());
                    System.out.println(date);
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
