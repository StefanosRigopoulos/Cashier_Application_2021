package gr.uop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileRegistration {

    public void writeToFile(CarService costumer, String leavingTime){
        try {
            FileWriter fw = new FileWriter("registrations.txt", true);

            fw.write(costumer.getID() + "," + costumer.getCarID() + "," + costumer.getCarType() + "," + costumer.getServicesMessage() + "," + costumer.getArrivalTime() + "," + leavingTime + "," + costumer.getSum() + ";" + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<CarService> readFromFile(){

        ArrayList<CarService> carServices = new ArrayList<>();

        try {
            File file = new File("registrations.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;

            while((line=br.readLine()) != null){
                sb.append(line);
                sb.append("\n");
            }

            String fileString = sb.toString();
            String[] fileStringLines = fileString.split(";");
            for (int i = 0; i < fileStringLines.length-1; i++){
                String[] lineContent = fileStringLines[i].split(",");

                if (lineContent[0].contains("\n")){
                    lineContent[0] = lineContent[0].substring(1, lineContent[0].length());
                }

                ArrayList<String> services = new ArrayList<>();
                for (int j = 3; j < lineContent.length-3; j++){
                    services.add(lineContent[j]);
                }

                carServices.add(new CarService(Integer.parseInt(lineContent[0]), lineContent[1], lineContent[2], services, lineContent[lineContent.length-3], lineContent[lineContent.length-2], Integer.parseInt(lineContent[lineContent.length-1])));
            }

            br.close();
            fr.close();

            file.delete();

        } catch (Exception e){
            // Nothing
        }

        return carServices;
    }
}
