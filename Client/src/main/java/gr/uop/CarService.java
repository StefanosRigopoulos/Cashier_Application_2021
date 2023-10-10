package gr.uop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class CarService implements Serializable{

    private int ID, counter, sum;
    private ArrayList<Integer> prices = new ArrayList<>();
    private ArrayList<String> services = new ArrayList<>();
    private String carID = null, carType = null, servicesMessage = null, arrivalTime = null, leavingTime = null;

    public CarService(int ID, String carID, String carType, ArrayList<String> serviceNames, String arrivalTime, String leavingTime, int sum){
        this.ID = ID;
        this.carID = carID;
        this.carType = carType;

        String temp = "";
        for (String a : serviceNames){
            if (a.equals("Wash Outside")){
                temp = temp + "Wash Outside,";
                services.add("Wash Outside");
                if (this.carType.equals("Car")){
                    prices.add(7);
                } else if (this.carType.equals("Jeep")){
                    prices.add(8);
                } else{
                    prices.add(6);
                }
            }
            if (a.equals("Wash Inside")){
                temp = temp + "Wash Inside,";
                services.add("Wash Inside");
                if (this.carType.equals("Car")){
                    prices.add(6);
                } else if (this.carType.equals("Jeep")){
                    prices.add(7);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("Wash In + Out")){
                temp = temp + "Wash In + Out,";
                services.add("Wash In + Out");
                if (this.carType.equals("Car")){
                    prices.add(12);
                } else if (this.carType.equals("Jeep")){
                    prices.add(14);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("Wash Outside Special")){
                temp = temp + "Wash Outside Special,";
                services.add("Wash Outside Special");
                if (this.carType.equals("Car")){
                    prices.add(9);
                } else if (this.carType.equals("Jeep")){
                    prices.add(10);
                } else{
                    prices.add(8);
                }
            }
            if (a.equals("Wash Inside Special")){
                temp = temp + "Wash Inside Special,";
                services.add("Wash Inside Special");
                if (this.carType.equals("Car")){
                    prices.add(8);
                } else if (this.carType.equals("Jeep")){
                    prices.add(9);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("Wash In + Out Special")){
                temp = temp + "Wash In + Out Special,";
                services.add("Wash In + Out Special");
                if (this.carType.equals("Car")){
                    prices.add(15);
                } else if (this.carType.equals("Jeep")){
                    prices.add(17);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("Biological Cleaning Inside")){
                temp = temp + "Biological Cleaning Inside,";
                services.add("Biological Cleaning Inside");
                if (this.carType.equals("Car")){
                    prices.add(80);
                } else if (this.carType.equals("Jeep")){
                    prices.add(80);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("Wax - Polishing")){
                temp = temp + "Wax - Polishing,";
                services.add("Wax - Polishing");
                if (this.carType.equals("Car")){
                    prices.add(80);
                } else if (this.carType.equals("Jeep")){
                    prices.add(90);
                } else{
                    prices.add(40);
                }
            }
            if (a.equals("Engine Wash")){
                temp = temp + "Engine Wash,";
                services.add("Engine Wash");
                if (this.carType.equals("Car")){
                    prices.add(20);
                } else if (this.carType.equals("Jeep")){
                    prices.add(20);
                } else{
                    prices.add(10);
                }
            }
            if (a.equals("Wash Chassis")){
                temp = temp + "Wash Chassis,";
                services.add("Wash Chassis");
                if (this.carType.equals("Car")){
                    prices.add(3);
                } else if (this.carType.equals("Jeep")){
                    prices.add(3);
                } else{
                    prices.add(0);
                }
            }
        }
        temp = temp.substring(0, temp.length()-1);
        this.servicesMessage = temp;

        this.arrivalTime = arrivalTime;
        this.leavingTime = leavingTime;
        this.sum = sum;

    }

    public CarService(String carID, String carType, String serviceIDs, int sum){

        this.carID = carID;

        if (carType.equals("car")) {
            this.carType = "Car";
            counter = 90000;
        } else if (carType.equals("jeep")){
            this.carType = "Jeep";
            counter = 40000;
        } else{
            this.carType = "Moto";
            counter = 0;
        }

        String temp = "";
        String[] splitServices = serviceIDs.split(",");
        for (String a : splitServices){
            if (a.equals("1")){
                counter += 10;
                temp = temp + "Wash Outside,";
                services.add("Wash Outside");
                if (this.carType.equals("Car")){
                    prices.add(7);
                } else if (this.carType.equals("Jeep")){
                    prices.add(8);
                } else{
                    prices.add(6);
                }
            }
            if (a.equals("2")){
                counter += 20;
                temp = temp + "Wash Inside,";
                services.add("Wash Inside");
                if (this.carType.equals("Car")){
                    prices.add(6);
                } else if (this.carType.equals("Jeep")){
                    prices.add(7);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("3")){
                counter += 30;
                temp = temp + "Wash In + Out,";
                services.add("Wash In + Out");
                if (this.carType.equals("Car")){
                    prices.add(12);
                } else if (this.carType.equals("Jeep")){
                    prices.add(14);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("4")){
                counter += 40;
                temp = temp + "Wash Outside Special,";
                services.add("Wash Outside Special");
                if (this.carType.equals("Car")){
                    prices.add(9);
                } else if (this.carType.equals("Jeep")){
                    prices.add(10);
                } else{
                    prices.add(8);
                }
            }
            if (a.equals("5")){
                counter += 50;
                temp = temp + "Wash Inside Special,";
                services.add("Wash Inside Special");
                if (this.carType.equals("Car")){
                    prices.add(8);
                } else if (this.carType.equals("Jeep")){
                    prices.add(9);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("6")){
                counter += 60;
                temp = temp + "Wash In + Out Special,";
                services.add("Wash In + Out Special");
                if (this.carType.equals("Car")){
                    prices.add(15);
                } else if (this.carType.equals("Jeep")){
                    prices.add(17);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("7")){
                counter += 70;
                temp = temp + "Biological Cleaning Inside,";
                services.add("Biological Cleaning Inside");
                if (this.carType.equals("Car")){
                    prices.add(80);
                } else if (this.carType.equals("Jeep")){
                    prices.add(80);
                } else{
                    prices.add(0);
                }
            }
            if (a.equals("8")){
                counter += 80;
                temp = temp + "Wax - Polishing,";
                services.add("Wax - Polishing");
                if (this.carType.equals("Car")){
                    prices.add(80);
                } else if (this.carType.equals("Jeep")){
                    prices.add(90);
                } else{
                    prices.add(40);
                }
            }
            if (a.equals("9")){
                counter += 90;
                temp = temp + "Engine Wash,";
                services.add("Engine Wash");
                if (this.carType.equals("Car")){
                    prices.add(20);
                } else if (this.carType.equals("Jeep")){
                    prices.add(20);
                } else{
                    prices.add(10);
                }
            }
            if (a.equals("10")){
                counter += 100;
                temp = temp + "Wash Chassis,";
                services.add("Wash Chassis");
                if (this.carType.equals("Car")){
                    prices.add(3);
                } else if (this.carType.equals("Jeep")){
                    prices.add(3);
                } else{
                    prices.add(0);
                }
            }
        }
        temp = temp.substring(0, temp.length()-1);
        this.servicesMessage = temp;

        this.sum = sum;

        // Making a unique ID.
        Random rand = new Random();
        this.ID = counter + (sum*rand.nextInt(50)+1);
    }

    public void setArrivalTime(String arrivalTime){
        this.arrivalTime = arrivalTime;
    }
    public void setLeavingTime(String leavingTime){
        this.leavingTime = leavingTime;
    }

    public int getID(){
        return this.ID;
    }
    public String getCarID(){
        return this.carID;
    }
    public String getCarType(){
        return this.carType;
    }
    public String getServicesMessage(){
        return this.servicesMessage;
    }
    public String getArrivalTime(){
        return this.arrivalTime;
    }
    public String getLeavingTime(){
        return this.leavingTime;
    }
    public int getSum(){
        return this.sum;
    }
    public ArrayList<Integer> getPrices(){
        return this.prices;
    }
    public ArrayList<String> getServices(){
        return this.services;
    }

    @Override
    public String toString(){
        return ID + ", " + carID + ", " + carType + ", " + servicesMessage + ", " + sum + ";";
    }
}
