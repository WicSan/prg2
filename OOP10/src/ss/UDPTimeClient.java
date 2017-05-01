/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author sandr
 */
public class UDPTimeClient {
    public static void main(String[] args) {
        int port = 123;
        String hostname = "127.0.0.1";
        
        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress address = InetAddress.getByName(hostname);
            byte[] raw = new byte[1024];
            //raw = "test server".getBytes();
            DatagramPacket packet = new DatagramPacket(raw, raw.length, address, port);
            socket.send(packet);
            socket.receive(packet);
            int len = packet.getLength();
            byte[] data = packet.getData();
            System.out.println(new String(data, 0, len));
        } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
        }
    }
}