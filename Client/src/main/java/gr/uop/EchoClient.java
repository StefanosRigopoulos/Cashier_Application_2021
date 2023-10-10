package gr.uop;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

    private Socket clientSocket;

    public EchoClient() {
        try {
            clientSocket = new Socket("localhost", 7777);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(CarService costumer){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
            oos.writeObject(costumer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
