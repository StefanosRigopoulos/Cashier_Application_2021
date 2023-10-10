package gr.uop;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static ServerSocket serverSocket = null;
    public static Socket socket = null;
    public static boolean listening = true;

    public Server() throws IOException{
        try {
            serverSocket = new ServerSocket(7777);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Server initialized.");
        System.out.println("Server waiting...");

        /*while(listening){
            new EchoServerThread(serverSocket.accept()).start();
        }
        socket.close();*/
    }
}
