/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author sandr
 */
public class PrimTestClient {
    public static void main(String[] args) throws IOException {
        int port = 99;
        String host = "10.155.126.31";
        BufferedReader keyStream = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try (Socket client = new Socket(host, port)) {
                PrintWriter outStream = new PrintWriter(client.getOutputStream());
                BufferedReader inStream = new BufferedReader(new InputStreamReader(client.getInputStream()));
                String line = inStream.readLine();
                System.out.println(line);
                line = keyStream.readLine();
                outStream.println(line);
                outStream.flush();
                line = inStream.readLine();
                System.out.println(line);
            }
        }
    }
}
