package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    public Parent root;
    public Stage stage;
    public Scene scene;
    @FXML
    public TextField text;
    public Label label;

    public void hex(ActionEvent event){
       try {
           String txt = text.getText();
           int number = Integer.parseInt(txt);
           label.setText(Integer.toHexString(number));
       } catch (Exception e){
           label.setText("Not a Number");
       }
    }
    public void bin(ActionEvent event){
        try {
            String txt = text.getText();
            int number = Integer.parseInt(txt);
            label.setText(Integer.toBinaryString(number));
        } catch (Exception e){
            label.setText("Not a Number");
        }
    }
    public void oct(ActionEvent event){
        try {
            String txt = text.getText();
            int number = Integer.parseInt(txt);
            label.setText(Integer.toOctalString(number));
        } catch (Exception e){
            label.setText("Not a Number");
        }
    }
    public void exit(ActionEvent event){
        System.exit(0);
    }
    public void clear(ActionEvent event){
        text.setText(null);
        label.setText("No Input");
    }

    public void nextwindow(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("nextwindow.fxml")));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void goback(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}