package gr.uop;

import java.io.IOException;
import java.net.ServerSocket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Window extends Application {

    private int fontSize = 25;
    public static TableView tableView;
    public static Server server = null;

    public ServerSocket serverSocket;

    public static void main(String[] args) {
        launch(args);
        try {
            server = new Server();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void start(Stage stageServer) {

        FileRegistration fr = new FileRegistration();
        ArrayList<CarService> savedCostumers = fr.readFromFile();

        try {
            server = new Server();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        tableView = new TableView();
        tableView.setPlaceholder(new Label("No entries to display here"));
        TableColumn<CarService, String> c1 = new TableColumn<>("ID");
        c1.setCellValueFactory(new PropertyValueFactory<>("ID"));
        c1.setEditable(false);
        c1.setPrefWidth(100.0);
        c1.setResizable(false);
        c1.setReorderable(false);
        TableColumn<CarService, String> c2 = new TableColumn<>("Car ID");
        c2.setCellValueFactory(new PropertyValueFactory<>("carID"));
        c2.setEditable(false);
        c2.setPrefWidth(80.0);
        c2.setResizable(false);
        c2.setReorderable(false);
        TableColumn<CarService, String> c3 = new TableColumn<>("Car Type");
        c3.setCellValueFactory(new PropertyValueFactory<>("carType"));
        c3.setEditable(false);
        c3.setPrefWidth(80.0);
        c3.setResizable(false);
        c3.setReorderable(false);
        TableColumn<CarService, String> c4 = new TableColumn<>("Services");
        c4.setCellValueFactory(new PropertyValueFactory<>("servicesMessage"));
        c4.setEditable(false);
        c4.setPrefWidth(600.0);
        c4.setResizable(true);
        c4.setReorderable(false);
        TableColumn<CarService, String> c5 = new TableColumn<>("Summary");
        c5.setCellValueFactory(new PropertyValueFactory<>("sum"));
        c5.setEditable(false);
        c5.setPrefWidth(100.0);
        c5.setResizable(false);
        c5.setReorderable(false);
        tableView.getColumns().add(c1);
        tableView.getColumns().add(c2);
        tableView.getColumns().add(c3);
        tableView.getColumns().add(c4);
        tableView.getColumns().add(c5);

        // Insert will be done when a costumer arrives in the EchoServer class or from the file.
        //
        if (!savedCostumers.isEmpty()){
            tableView.getItems().addAll(savedCostumers);
        }
        // Debugging costumers.
        CarService cs1 = new CarService("TYA4567", "car", "1,7,8,9,", 187);
        CarService cs2 = new CarService("TRZ9876", "jeep", "3,6,7,10,", 114);
        CarService cs3 = new CarService("POD4567", "car", "1,7,8,9,10,", 190);
        CarService cs4 = new CarService("YGD9876", "moto", "4,8,", 48);
        //tableView.getItems().add(cs1);
        //tableView.getItems().add(cs2);
        //tableView.getItems().add(cs3);
        //tableView.getItems().add(cs4);
        //

        TableViewSelectionModel<CarService> selectionModel = tableView.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.SINGLE);

        // Setting up the layout of the buttons.
        Button remove = new Button("Remove");
        remove.setFont(new Font("arial", fontSize-5));
        remove.setTextAlignment(TextAlignment.CENTER);
        Button cash = new Button("Cash");
        cash.setFont(new Font("arial", fontSize-5));
        cash.setTextAlignment(TextAlignment.CENTER);

        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);
        buttons.setPadding(new Insets(30.0));
        buttons.setSpacing(20.0);
        buttons.getChildren().addAll(remove, cash);

        // Setting up functions for the buttons.
        // Making remove button.
        remove.setOnAction(event -> {
            if (!selectionModel.isEmpty()){
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation");
                alert.setHeaderText("Proceed with removal of the registry?\n");
                alert.setContentText(null);
    
                Optional<ButtonType> result = alert.showAndWait();
                if (result.isPresent()){
                    if (result.get() == ButtonType.OK){
                        tableView.getItems().remove(tableView.getSelectionModel().getSelectedIndex());
                        selectionModel.clearSelection();
                    } else{
                        selectionModel.clearSelection();
                        event.consume();
                    }
                }
            }
        });
        // Making cash button.
        cash.setOnAction(event -> {
            if (!selectionModel.isEmpty()){
                ObservableList<CarService> selectedCar = selectionModel.getSelectedItems();

                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Receipt");
                alert.setHeaderText("Proceed with transaction?\n");

                String receipt = "";
                for (int i = 0; i < selectedCar.get(0).getServices().size(); i++){
                    receipt = receipt + selectedCar.get(0).getServices().get(i) + " : " + selectedCar.get(0).getPrices().get(i) + "$" + "\n";
                }

                alert.setContentText("Car ID : " + selectedCar.get(0).getCarID() + "\n\n" + receipt + "\nSummary : " + selectedCar.get(0).getSum() + "$");

                Optional<ButtonType> result = alert.showAndWait();
                if (result.isPresent()){
                    if (result.get() == ButtonType.OK){

                        Date date = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        String leavingTime = sdf.format(date);

                        // Writing cashing to the registrations book.
                        fr.writeToFile(selectedCar.get(0), leavingTime);

                        tableView.getItems().remove(tableView.getSelectionModel().getSelectedIndex());
                        selectionModel.clearSelection();
                    } else{
                        selectionModel.clearSelection();
                        event.consume();
                    }
                }
            }
        });

        VBox mainServer = new VBox();
        mainServer.setAlignment(Pos.CENTER);
        mainServer.setPadding(new Insets(30.0));
        mainServer.setSpacing(20.0);
        mainServer.getChildren().addAll(tableView, buttons);

        // Setting up the close_window function.
        stageServer.addEventFilter(WindowEvent.WINDOW_CLOSE_REQUEST, event -> {
            ObservableList<CarService> items = tableView.getItems();
            if (items.size() > 0){
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Warning");
                alert.setHeaderText("You can NOT exit when there are costumers waiting.");
                alert.setContentText(null);
                alert.showAndWait();
                event.consume();
            } else{
                Server.listening = false;
            }
        });

        Scene stageScene = new Scene(mainServer, 1024, 768);
        stageServer.setTitle("Cash Desk");
        stageServer.setResizable(false);
        stageServer.setScene(stageScene);
        stageServer.show();

        /*
        while(Server.listening){
            try {
                new EchoServerThread(Server.serverSocket.accept()).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            Server.socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public static void insertInArray(CarService costumer){
        if (costumer != null){
            tableView.getItems().add(costumer);
        }
    }
}