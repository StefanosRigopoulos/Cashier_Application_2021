package gr.uop;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EchoServerThread extends Thread{

    private int sum;
    private String carID = "", carType = "", services = "", arrivalTime = "";
    private CarService costumer;

    private Socket socket;

    public EchoServerThread(Socket socket){
        super("Server Thread");
        this.socket = socket;
    }

    @Override
    public void run(){
        System.out.println("Server accepted connection: " + socket);
        costumer = receiveCostumer();

        System.out.println(costumer.toString());

        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public CarService receiveCostumer(){

        CarService tmp = null;

        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            arrivalTime = sdf.format(date);

            try {
                tmp = (CarService) ois.readObject();
                tmp.setArrivalTime(arrivalTime);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tmp;
    }

    public String getCarID(){
        return carID;
    }
    public String getCarType(){
        return carType;
    }
    public String getServices(){
        return services;
    }
    public int getSum(){
        return sum;
    }
    public String getTime(){
        return arrivalTime;
    }
    public CarService getCarService(){
        return costumer;
    }
}
