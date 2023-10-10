package gr.uop;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Client extends Application {

    private int fontSize = 25;

    @Override
    public void start(Stage stageCarPlate) {

        // TextField setup for car plates.
        TextField text = new TextField();
        text.setEditable(false);
        text.setFont(new Font("arial", fontSize));
        text.setMinWidth(600.0);

        Button backSpace = new Button("       <---       ");
        backSpace.setFont(new Font("arial", fontSize));
        backSpace.setOnAction(e -> {
            if (!text.getText().isEmpty()) {
                text.setText(text.getText().substring(0, text.getText().length()-1));
            }
        });

        HBox textLine = new HBox();
        textLine.getChildren().addAll(text, backSpace);
        textLine.setAlignment(Pos.CENTER);
        textLine.setPadding(new Insets(10, 10, 10 ,45));
        textLine.setSpacing(75.0);


        // Keyboard setup.
        // LETTERS
        // First row of keys.
        Button q = new Button("Q");
        q.setFont(new Font("arial", fontSize));
        q.setOnAction(event -> {
            text.setText(text.getText() + "Q");
        });
        Button w = new Button("W");
        w.setFont(new Font("arial", fontSize));
        w.setOnAction(event -> {
            text.setText(text.getText() + "W");
        });
        Button e = new Button("E");
        e.setFont(new Font("arial", fontSize));
        e.setOnAction(event -> {
            text.setText(text.getText() + "E");
        });
        Button r = new Button("R");
        r.setFont(new Font("arial", fontSize));
        r.setOnAction(event -> {
            text.setText(text.getText() + "R");
        });
        Button t = new Button("T");
        t.setFont(new Font("arial", fontSize));
        t.setOnAction(event -> {
            text.setText(text.getText() + "T");
        });
        Button y = new Button("Y");
        y.setFont(new Font("arial", fontSize));
        y.setOnAction(event -> {
            text.setText(text.getText() + "Y");
        });
        Button u = new Button("U");
        u.setFont(new Font("arial", fontSize));
        u.setOnAction(event -> {
            text.setText(text.getText() + "U");
        });
        Button i = new Button("I");
        i.setFont(new Font("arial", fontSize));
        i.setOnAction(event -> {
            text.setText(text.getText() + "I");
        });
        Button o = new Button("O");
        o.setFont(new Font("arial", fontSize));
        o.setOnAction(event -> {
            text.setText(text.getText() + "O");
        });
        Button p = new Button("P");
        p.setFont(new Font("arial", fontSize));
        p.setOnAction(event -> {
            text.setText(text.getText() + "P");
        });

        HBox firstRow = new HBox();
        firstRow.getChildren().addAll(q, w, e, r, t, y, u, i, o, p);
        firstRow.setAlignment(Pos.CENTER);
        firstRow.setPadding(new Insets(10.0));
        firstRow.setSpacing(15.0);

        // Second row of keys.
        Button a = new Button("A");
        a.setFont(new Font("arial", fontSize));
        a.setOnAction(event -> {
            text.setText(text.getText() + "A");
        });
        Button s = new Button("S");
        s.setFont(new Font("arial", fontSize));
        s.setOnAction(event -> {
            text.setText(text.getText() + "S");
        });
        Button d = new Button("D");
        d.setFont(new Font("arial", fontSize));
        d.setOnAction(event -> {
            text.setText(text.getText() + "D");
        });
        Button f = new Button("F");
        f.setFont(new Font("arial", fontSize));
        f.setOnAction(event -> {
            text.setText(text.getText() + "F");
        });
        Button g = new Button("G");
        g.setFont(new Font("arial", fontSize));
        g.setOnAction(event -> {
            text.setText(text.getText() + "G");
        });
        Button h = new Button("H");
        h.setFont(new Font("arial", fontSize));
        h.setOnAction(event -> {
            text.setText(text.getText() + "H");
        });
        Button j = new Button("J");
        j.setFont(new Font("arial", fontSize));
        j.setOnAction(event -> {
            text.setText(text.getText() + "J");
        });
        Button k = new Button("K");
        k.setFont(new Font("arial", fontSize));
        k.setOnAction(event -> {
            text.setText(text.getText() + "K");
        });
        Button l = new Button("L");
        l.setFont(new Font("arial", fontSize));
        l.setOnAction(event -> {
            text.setText(text.getText() + "L");
        });

        HBox secondRow = new HBox();
        secondRow.getChildren().addAll(a, s, d, f, g, h, j, k, l);
        secondRow.setAlignment(Pos.CENTER);
        secondRow.setPadding(new Insets(10.0));
        secondRow.setSpacing(15.0);

        // Third row of letters.
        Button z = new Button("Z");
        z.setFont(new Font("arial", fontSize));
        z.setOnAction(event -> {
            text.setText(text.getText() + "Z");
        });
        Button x = new Button("X");
        x.setFont(new Font("arial", fontSize));
        x.setOnAction(event -> {
            text.setText(text.getText() + "X");
        });
        Button c = new Button("C");
        c.setFont(new Font("arial", fontSize));
        c.setOnAction(event -> {
            text.setText(text.getText() + "C");
        });
        Button v = new Button("V");
        v.setFont(new Font("arial", fontSize));
        v.setOnAction(event -> {
            text.setText(text.getText() + "V");
        });
        Button b = new Button("B");
        b.setFont(new Font("arial", fontSize));
        b.setOnAction(event -> {
            text.setText(text.getText() + "B");
        });
        Button n = new Button("N");
        n.setFont(new Font("arial", fontSize));
        n.setOnAction(event -> {
            text.setText(text.getText() + "N");
        });
        Button m = new Button("M");
        m.setFont(new Font("arial", fontSize));
        m.setOnAction(event -> {
            text.setText(text.getText() + "M");
        });

        HBox thirdRow = new HBox();
        thirdRow.getChildren().addAll(z, x, c, v, b, n, m);
        thirdRow.setAlignment(Pos.CENTER);
        thirdRow.setPadding(new Insets(10.0));
        thirdRow.setSpacing(15.0);

        // Fourth row of letters.
        Button space = new Button("                                    ");
        space.setFont(new Font("arial", fontSize));
        space.setOnAction(event -> {
            text.setText(text.getText() + " ");
        });

        HBox fourthRow = new HBox();
        fourthRow.getChildren().addAll(space);
        fourthRow.setAlignment(Pos.CENTER);
        fourthRow.setPadding(new Insets(10.0));
        fourthRow.setSpacing(15.0);

        // Setting up the letters layout.
        VBox letters = new VBox();
        letters.getChildren().addAll(firstRow, secondRow, thirdRow, fourthRow);
        letters.setPadding(new Insets(20.0));
        letters.setAlignment(Pos.CENTER);


        // NUMBERS
        // First row of numbers.
        Button num7 = new Button("7");
        num7.setFont(new Font("arial", fontSize));
        num7.setOnAction(event -> {
            text.setText(text.getText() + "7");
        });
        Button num8 = new Button("8");
        num8.setFont(new Font("arial", fontSize));
        num8.setOnAction(event -> {
            text.setText(text.getText() + "8");
        });
        Button num9 = new Button("9");
        num9.setFont(new Font("arial", fontSize));
        num9.setOnAction(event -> {
            text.setText(text.getText() + "9");
        });

        HBox firstRowNum = new HBox();
        firstRowNum.getChildren().addAll(num7, num8, num9);
        firstRowNum.setAlignment(Pos.CENTER);
        firstRowNum.setPadding(new Insets(10.0));
        firstRowNum.setSpacing(15.0);

        // Second row of numbers.
        Button num4 = new Button("4");
        num4.setFont(new Font("arial", fontSize));
        num4.setOnAction(event -> {
            text.setText(text.getText() + "4");
        });
        Button num5 = new Button("5");
        num5.setFont(new Font("arial", fontSize));
        num5.setOnAction(event -> {
            text.setText(text.getText() + "5");
        });
        Button num6 = new Button("6");
        num6.setFont(new Font("arial", fontSize));
        num6.setOnAction(event -> {
            text.setText(text.getText() + "6");
        });

        HBox secondRowNum = new HBox();
        secondRowNum.getChildren().addAll(num4, num5, num6);
        secondRowNum.setAlignment(Pos.CENTER);
        secondRowNum.setPadding(new Insets(10.0));
        secondRowNum.setSpacing(15.0);

        // Third row of numbers.
        Button num1 = new Button("1");
        num1.setFont(new Font("arial", fontSize));
        num1.setOnAction(event -> {
            text.setText(text.getText() + "1");
        });
        Button num2 = new Button("2");
        num2.setFont(new Font("arial", fontSize));
        num2.setOnAction(event -> {
            text.setText(text.getText() + "2");
        });
        Button num3 = new Button("3");
        num3.setFont(new Font("arial", fontSize));
        num3.setOnAction(event -> {
            text.setText(text.getText() + "3");
        }); 

        HBox thirdRowNum = new HBox();
        thirdRowNum.getChildren().addAll(num1, num2, num3);
        thirdRowNum.setAlignment(Pos.CENTER);
        thirdRowNum.setPadding(new Insets(10.0));
        thirdRowNum.setSpacing(15.0);

        // Fourth row of numbers.
        Button num0 = new Button("         0         ");
        num0.setFont(new Font("arial", fontSize));
        num0.setOnAction(event -> {
            text.setText(text.getText() + "0");
        });

        HBox fourthRowNum = new HBox();
        fourthRowNum.getChildren().addAll(num0);
        fourthRowNum.setAlignment(Pos.CENTER);
        fourthRowNum.setPadding(new Insets(10.0));
        fourthRowNum.setSpacing(15.0);

        // Setting up the numbers layout.
        VBox numbers = new VBox();
        numbers.getChildren().addAll(firstRowNum, secondRowNum, thirdRowNum, fourthRowNum);
        numbers.setPadding(new Insets(20.0));
        numbers.setAlignment(Pos.CENTER);


        // Setting up the keyboard layout.
        HBox keyboard = new HBox();
        keyboard.getChildren().addAll(letters, numbers);
        keyboard.setPadding(new Insets(20.0));
        keyboard.setAlignment(Pos.CENTER);


        // Setting up forward button.
        Button forward = new Button("   Next   ");
        forward.setFont(new Font("arial", fontSize));
        forward.setOnAction(event -> {
            if (text.getText().length() < 2){
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Car plate must have at least two (2) digits.");
                alert.setContentText(null);
                alert.showAndWait();
            } else {

                //Setting up the CarID
                String carID = text.getText();

                // Setting up the list of services.
                Label serviceName = new Label("Services");
                serviceName.setFont(new Font("arial", fontSize));
                serviceName.setAlignment(Pos.CENTER);
                Label vehicleType = new Label("Vehicle Type");
                vehicleType.setFont(new Font("arial", fontSize));
                vehicleType.setAlignment(Pos.CENTER);
                
                // Setting up some spacers.
                Separator separator1 = new Separator();
                Separator separator2 = new Separator();
                Separator separator3 = new Separator();

                // Setting up the vehicle type input.
                RadioButton carBtn = new RadioButton("Car");
                carBtn.setFont(new Font("arial", fontSize-5));
                carBtn.setTextAlignment(TextAlignment.CENTER);
                RadioButton jeepBtn = new RadioButton("Jeep");
                jeepBtn.setFont(new Font("arial", fontSize-5));
                jeepBtn.setTextAlignment(TextAlignment.CENTER);
                RadioButton motoBtn = new RadioButton("Motorbike");
                motoBtn.setFont(new Font("arial", fontSize-5));
                motoBtn.setTextAlignment(TextAlignment.CENTER);
                ToggleGroup tgType = new ToggleGroup();
                carBtn.setToggleGroup(tgType);
                jeepBtn.setToggleGroup(tgType);
                motoBtn.setToggleGroup(tgType);

                // Setting up the services
                RadioButton sb1 = new RadioButton("Wash Outside");
                sb1.setFont(new Font("arial", fontSize-5));
                sb1.setTextAlignment(TextAlignment.CENTER);
                Label sb1CAR = new Label("7");
                sb1CAR.setFont(new Font("arial", fontSize-5));
                sb1CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb1JEEP = new Label("8");
                sb1JEEP.setFont(new Font("arial", fontSize-5));
                sb1JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb1MOTO = new Label("6");
                sb1MOTO.setFont(new Font("arial", fontSize-5));
                sb1MOTO.setTextAlignment(TextAlignment.CENTER);

                RadioButton sb2 = new RadioButton("Wash Inside");
                sb2.setFont(new Font("arial", fontSize-5));
                sb2.setTextAlignment(TextAlignment.CENTER);
                Label sb2CAR = new Label("6");
                sb2CAR.setFont(new Font("arial", fontSize-5));
                sb2CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb2JEEP = new Label("7");
                sb2JEEP.setFont(new Font("arial", fontSize-5));
                sb2JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb2MOTO = new Label("-");
                sb2MOTO.setFont(new Font("arial", fontSize-5));
                sb2MOTO.setTextAlignment(TextAlignment.CENTER);

                RadioButton sb3 = new RadioButton("Wash In + Out");
                sb3.setFont(new Font("arial", fontSize-5));
                sb3.setTextAlignment(TextAlignment.CENTER);
                Label sb3CAR = new Label("12");
                sb3CAR.setFont(new Font("arial", fontSize-5));
                sb3CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb3JEEP = new Label("14");
                sb3JEEP.setFont(new Font("arial", fontSize-5));
                sb3JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb3MOTO = new Label("-");
                sb3MOTO.setFont(new Font("arial", fontSize-5));
                sb3MOTO.setTextAlignment(TextAlignment.CENTER);

                RadioButton sb4 = new RadioButton("Wash Outside Special");
                sb4.setFont(new Font("arial", fontSize-5));
                sb4.setTextAlignment(TextAlignment.CENTER);
                Label sb4CAR = new Label("9");
                sb4CAR.setFont(new Font("arial", fontSize-5));
                sb4CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb4JEEP = new Label("10");
                sb4JEEP.setFont(new Font("arial", fontSize-5));
                sb4JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb4MOTO = new Label("8");
                sb4MOTO.setFont(new Font("arial", fontSize-5));
                sb4MOTO.setTextAlignment(TextAlignment.CENTER);

                RadioButton sb5 = new RadioButton("Wash Inside Special");
                sb5.setFont(new Font("arial", fontSize-5));
                sb5.setTextAlignment(TextAlignment.CENTER);
                Label sb5CAR = new Label("8");
                sb5CAR.setFont(new Font("arial", fontSize-5));
                sb5CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb5JEEP = new Label("9");
                sb5JEEP.setFont(new Font("arial", fontSize-5));
                sb5JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb5MOTO = new Label("-");
                sb5MOTO.setFont(new Font("arial", fontSize-5));
                sb5MOTO.setTextAlignment(TextAlignment.CENTER);

                RadioButton sb6 = new RadioButton("Wash In + Out Special");
                sb6.setFont(new Font("arial", fontSize-5));
                sb6.setTextAlignment(TextAlignment.CENTER);
                Label sb6CAR = new Label("15");
                sb6CAR.setFont(new Font("arial", fontSize-5));
                sb6CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb6JEEP = new Label("17");
                sb6JEEP.setFont(new Font("arial", fontSize-5));
                sb6JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb6MOTO = new Label("-");
                sb6MOTO.setFont(new Font("arial", fontSize-5));
                sb6MOTO.setTextAlignment(TextAlignment.CENTER);

                RadioButton sb7 = new RadioButton("Biological Cleaning Inside");
                sb7.setFont(new Font("arial", fontSize-5));
                sb7.setTextAlignment(TextAlignment.CENTER);
                Label sb7CAR = new Label("80");
                sb7CAR.setFont(new Font("arial", fontSize-5));
                sb7CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb7JEEP = new Label("80");
                sb7JEEP.setFont(new Font("arial", fontSize-5));
                sb7JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb7MOTO = new Label("-");
                sb7MOTO.setFont(new Font("arial", fontSize-5));
                sb7MOTO.setTextAlignment(TextAlignment.CENTER);

                RadioButton sb8 = new RadioButton("Wax - Polishing");
                sb8.setFont(new Font("arial", fontSize-5));
                sb8.setTextAlignment(TextAlignment.CENTER);
                Label sb8CAR = new Label("80");
                sb8CAR.setFont(new Font("arial", fontSize-5));
                sb8CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb8JEEP = new Label("90");
                sb8JEEP.setFont(new Font("arial", fontSize-5));
                sb8JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb8MOTO = new Label("40");
                sb8MOTO.setFont(new Font("arial", fontSize-5));
                sb8MOTO.setTextAlignment(TextAlignment.CENTER);

                RadioButton sb9 = new RadioButton("Engine Wash");
                sb9.setFont(new Font("arial", fontSize-5));
                sb9.setTextAlignment(TextAlignment.CENTER);
                Label sb9CAR = new Label("20");
                sb9CAR.setFont(new Font("arial", fontSize-5));
                sb9CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb9JEEP = new Label("20");
                sb9JEEP.setFont(new Font("arial", fontSize-5));
                sb9JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb9MOTO = new Label("10");
                sb9MOTO.setFont(new Font("arial", fontSize-5));
                sb9MOTO.setTextAlignment(TextAlignment.CENTER);

                RadioButton sb10 = new RadioButton("Wash Chassis");
                sb10.setFont(new Font("arial", fontSize-5));
                sb10.setTextAlignment(TextAlignment.CENTER);
                Label sb10CAR = new Label("3");
                sb10CAR.setFont(new Font("arial", fontSize-5));
                sb10CAR.setTextAlignment(TextAlignment.CENTER);
                Label sb10JEEP = new Label("3");
                sb10JEEP.setFont(new Font("arial", fontSize-5));
                sb10JEEP.setTextAlignment(TextAlignment.CENTER);
                Label sb10MOTO = new Label("-");
                sb10MOTO.setFont(new Font("arial", fontSize-5));
                sb10MOTO.setTextAlignment(TextAlignment.CENTER);

                // Setting toggles for services.
                ToggleGroup tgWash = new ToggleGroup();
                sb1.setToggleGroup(tgWash);
                sb2.setToggleGroup(tgWash);
                sb3.setToggleGroup(tgWash);
                sb4.setToggleGroup(tgWash);
                sb5.setToggleGroup(tgWash);
                sb6.setToggleGroup(tgWash);
                carBtn.setOnAction(event2 -> {
                    sb2.setDisable(false);
                    sb3.setDisable(false);
                    sb5.setDisable(false);
                    sb6.setDisable(false);
                    sb7.setDisable(false);
                    sb10.setDisable(false);
                });
                jeepBtn.setOnAction(event2 -> {
                    sb2.setDisable(false);
                    sb3.setDisable(false);
                    sb5.setDisable(false);
                    sb6.setDisable(false);
                    sb7.setDisable(false);
                    sb10.setDisable(false);
                });
                motoBtn.setOnAction(event2 -> {
                    sb2.setDisable(true);
                    sb2.setSelected(false);
                    sb3.setDisable(true);
                    sb3.setSelected(false);
                    sb5.setDisable(true);
                    sb5.setSelected(false);
                    sb6.setDisable(true);
                    sb6.setSelected(false);
                    sb7.setDisable(true);
                    sb7.setSelected(false);
                    sb10.setDisable(true);
                    sb10.setSelected(false);
                });

                GridPane serviceList = new GridPane();
                serviceList.setAlignment(Pos.CENTER);
                serviceList.setHgap(20.0);
                serviceList.setVgap(10.0);
                serviceList.add(serviceName, 0, 0, 1, 1);
                serviceList.add(vehicleType, 1, 0, 3, 1);
                serviceList.add(separator1, 0, 1, 4, 1);
                serviceList.add(carBtn, 1, 2);
                serviceList.add(jeepBtn, 2, 2);
                serviceList.add(motoBtn, 3, 2);
                serviceList.add(separator2, 0, 3, 4, 1);
                serviceList.add(sb1, 0, 4);
                serviceList.add(sb1CAR, 1, 4);
                serviceList.add(sb1JEEP, 2, 4);
                serviceList.add(sb1MOTO, 3, 4);
                serviceList.add(sb2, 0, 5);
                serviceList.add(sb2CAR, 1, 5);
                serviceList.add(sb2JEEP, 2, 5);
                serviceList.add(sb2MOTO, 3, 5);
                serviceList.add(sb3, 0, 6);
                serviceList.add(sb3CAR, 1, 6);
                serviceList.add(sb3JEEP, 2, 6);
                serviceList.add(sb3MOTO, 3, 6);
                serviceList.add(sb4, 0, 7);
                serviceList.add(sb4CAR, 1, 7);
                serviceList.add(sb4JEEP, 2, 7);
                serviceList.add(sb4MOTO, 3, 7);
                serviceList.add(sb5, 0, 8);
                serviceList.add(sb5CAR, 1, 8);
                serviceList.add(sb5JEEP, 2, 8);
                serviceList.add(sb5MOTO, 3, 8);
                serviceList.add(sb6, 0, 9);
                serviceList.add(sb6CAR, 1, 9);
                serviceList.add(sb6JEEP, 2, 9);
                serviceList.add(sb6MOTO, 3, 9);
                serviceList.add(sb7, 0, 10);
                serviceList.add(sb7CAR, 1, 10);
                serviceList.add(sb7JEEP, 2, 10);
                serviceList.add(sb7MOTO, 3, 10);
                serviceList.add(sb8, 0, 11);
                serviceList.add(sb8CAR, 1, 11);
                serviceList.add(sb8JEEP, 2, 11);
                serviceList.add(sb8MOTO, 3, 11);
                serviceList.add(sb9, 0, 12);
                serviceList.add(sb9CAR, 1, 12);
                serviceList.add(sb9JEEP, 2, 12);
                serviceList.add(sb9MOTO, 3, 12);
                serviceList.add(sb10, 0, 13);
                serviceList.add(sb10CAR, 1, 13);
                serviceList.add(sb10JEEP, 2, 13);
                serviceList.add(sb10MOTO, 3, 13);
                serviceList.add(separator3, 0, 14, 4, 1);

                // Setting up options.
                Button backBtn = new Button("    Back    ");
                backBtn.setFont(new Font("arial", fontSize));
                Button submitBtn = new Button("   Submit   ");
                submitBtn.setFont(new Font("arial", fontSize));
                submitBtn.setOnAction(event2 -> {
                    if (!carBtn.isSelected() && !jeepBtn.isSelected() && !motoBtn.isSelected()){
                        Alert alert = new Alert(AlertType.ERROR);

                        alert.setTitle("Error");
                        alert.setHeaderText("You need to select a vehicle type before submitting.");
                        alert.setContentText(null);

                        alert.showAndWait();
                    } else if (!sb1.isSelected() && !sb2.isSelected() && !sb3.isSelected() && !sb4.isSelected() && !sb5.isSelected() && !sb6.isSelected() && !sb7.isSelected() && !sb8.isSelected() && !sb9.isSelected() && !sb10.isSelected()){
                        Alert alert = new Alert(AlertType.ERROR);

                        alert.setTitle("Error");
                        alert.setHeaderText("You need to select at least one (1) service before submitting.");
                        alert.setContentText(null);

                        alert.showAndWait();
                    } else{
                        Alert alert = new Alert(AlertType.CONFIRMATION);

                        alert.setTitle("Confirm your order");
                        alert.setHeaderText("Receipt based on your services: ");
    
                        int sb1Cost, sb2Cost, sb3Cost, sb4Cost, sb5Cost, sb6Cost, sb7Cost, sb8Cost, sb9Cost, sb10Cost, sum = 0;
                        String temp = "", services = "";
                        if (sb1.isSelected()){
                            sb1Cost = 0;
                            services = services + "1,";
                            if (carBtn.isSelected()){
                                sb1Cost = 7;
                            } else if (jeepBtn.isSelected()){
                                sb1Cost = 8;
                            } else{
                                sb1Cost = 6;
                            }
                            sum = sum + sb1Cost;
                            temp = temp + sb1.getText() + " : " + sb1Cost + "$" + "\n";
                        }
                        if (sb2.isSelected()){
                            sb2Cost = 0;
                            services = services + "2,";
                            if (carBtn.isSelected()){
                                sb2Cost = 6;
                            } else if (jeepBtn.isSelected()){
                                sb2Cost = 7;
                            } else{
                                sb2Cost = 0;
                            }
                            sum = sum + sb2Cost;
                            temp = temp + sb2.getText() + " : " + sb2Cost + "$" + "\n";
                        }
                        if (sb3.isSelected()){
                            sb3Cost = 0;
                            services = services + "3,";
                            if (carBtn.isSelected()){
                                sb3Cost = 12;
                            } else if (jeepBtn.isSelected()){
                                sb3Cost = 14;
                            } else{
                                sb3Cost = 0;
                            }
                            sum = sum + sb3Cost;
                            temp = temp + sb3.getText() + " : " + sb3Cost + "$" + "\n";
                        }
                        if (sb4.isSelected()){
                            sb4Cost = 0;
                            services = services + "4,";
                            if (carBtn.isSelected()){
                                sb4Cost = 9;
                            } else if (jeepBtn.isSelected()){
                                sb4Cost = 10;
                            } else{
                                sb4Cost = 8;
                            }
                            sum = sum + sb4Cost;
                            temp = temp + sb4.getText() + " : " + sb4Cost + "$" + "\n";
                        }
                        if (sb5.isSelected()){
                            sb5Cost = 0;
                            services = services + "5,";
                            if (carBtn.isSelected()){
                                sb5Cost = 8;
                            } else if (jeepBtn.isSelected()){
                                sb5Cost = 9;
                            } else{
                                sb5Cost = 0;
                            }
                            sum = sum + sb5Cost;
                            temp = temp + sb5.getText() + " : " + sb5Cost + "$" + "\n";
                        }
                        if (sb6.isSelected()){
                            sb6Cost = 0;
                            services = services + "6,";
                            if (carBtn.isSelected()){
                                sb6Cost = 15;
                            } else if (jeepBtn.isSelected()){
                                sb6Cost = 17;
                            } else{
                                sb6Cost = 0;
                            }
                            sum = sum + sb6Cost;
                            temp = temp + sb6.getText() + " : " + sb6Cost + "$" + "\n";
                        }
                        if (sb7.isSelected()){
                            sb7Cost = 0;
                            services = services + "7,";
                            if (carBtn.isSelected()){
                                sb7Cost = 80;
                            } else if (jeepBtn.isSelected()){
                                sb7Cost = 80;
                            } else{
                                sb7Cost = 0;
                            }
                            sum = sum + sb7Cost;
                            temp = temp + sb7.getText() + " : " + sb7Cost + "$" + "\n";
                        }
                        if (sb8.isSelected()){
                            sb8Cost = 0;
                            services = services + "8,";
                            if (carBtn.isSelected()){
                                sb8Cost = 80;
                            } else if (jeepBtn.isSelected()){
                                sb8Cost = 90;
                            } else{
                                sb8Cost = 40;
                            }
                            sum = sum + sb8Cost;
                            temp = temp + sb8.getText() + " : " + sb8Cost + "$" + "\n";
                        }
                        if (sb9.isSelected()){
                            sb9Cost = 0;
                            services = services + "9,";
                            if (carBtn.isSelected()){
                                sb9Cost = 20;
                            } else if (jeepBtn.isSelected()){
                                sb9Cost = 20;
                            } else{
                                sb9Cost = 10;
                            }
                            sum = sum + sb9Cost;
                            temp = temp + sb9.getText() + " : " + sb9Cost + "$" + "\n";
                        }
                        if (sb10.isSelected()){
                            sb10Cost = 0;
                            services = services + "10,";
                            if (carBtn.isSelected()){
                                sb10Cost = 3;
                            } else if (jeepBtn.isSelected()){
                                sb10Cost = 3;
                            } else{
                                sb10Cost = 0;
                            }
                            sum = sum + sb10Cost;
                            temp = temp + sb10.getText() + " : " + sb10Cost + "$" + "\n";
                        }
                        temp = temp + "\nSummary : " + sum + "$";

                        alert.setContentText(temp);
                        Optional<ButtonType> result = alert.showAndWait();
                        if (result.isPresent()){
                            if (result.get() == ButtonType.OK){

                                // Send to server.
                                String carType = "";
                                EchoClient client = new EchoClient();

                                if (carBtn.isSelected()){
                                    carType = "car";
                                } else if (jeepBtn.isSelected()){
                                    carType = "jeep";
                                } else {
                                    carType = "moto";
                                }

                                // Creating a listing for the new order placed.
                                CarService costumer = new CarService(carID, carType, services, sum);
                                client.sendMessage(costumer);

                                System.out.println("Sent to server!");
                                event.consume();

                            } else{
                                event.consume();
                            }
                        } else{
                            event.consume();
                        }
                    }
                });

                HBox options = new HBox();
                options.getChildren().addAll(backBtn, submitBtn);
                options.setAlignment(Pos.CENTER);
                options.setPadding(new Insets(20.0));
                options.setSpacing(20.0);



                VBox mainServices = new VBox();
                mainServices.getChildren().addAll(serviceList, options);
                mainServices.setAlignment(Pos.CENTER);
                mainServices.setPadding(new Insets(20.0));

                Scene stageScene = new Scene(mainServices, 1024, 768);
                Stage stageServices = new Stage();
                stageServices.setTitle("Services");
                stageServices.setResizable(true);
                stageServices.setMinHeight(768);
                stageServices.setMinWidth(1024);
                stageServices.setMaxHeight(1080);
                stageServices.setMaxWidth(1920);
                stageServices.setScene(stageScene);
                stageServices.show();
                
                // Setting up back button function.
                backBtn.setOnAction(event2 -> {
                    stageServices.close();
                });
            }
        });

        VBox mainCarBox = new VBox();
        mainCarBox.setAlignment(Pos.CENTER);
        mainCarBox.getChildren().addAll(textLine, keyboard, forward);
        mainCarBox.setSpacing(20.0);
        mainCarBox.setPadding(new Insets(20.0));

        Scene sceneCarPlate = new Scene(mainCarBox, 1024, 768);
        stageCarPlate.setTitle("Car Plate");
        stageCarPlate.setResizable(true);
        stageCarPlate.setMinHeight(768);
        stageCarPlate.setMinWidth(1024);
        stageCarPlate.setMaxHeight(1080);
        stageCarPlate.setMaxWidth(1920);
        stageCarPlate.setScene(sceneCarPlate);
        stageCarPlate.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
