/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/**
 *
 * @author sandr
 */
public class UDPTimeServer {
    public static void main(String[] args) {
        //int port = Integer.parseInt(args[0]);
        int port = 123;
        try (DatagramSocket socket = new DatagramSocket(port)) {
            while (true) {
                DatagramPacket packet =
                    new DatagramPacket(new byte[1024], 1024);
                System.out.println("warten...");
                socket.receive(packet);
                InetAddress address = packet.getAddress();
                port = packet.getPort();
                
                byte[] data = new Date().toString().getBytes();
                packet = new DatagramPacket(data, data.length, address, port);
                socket.send(packet);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
