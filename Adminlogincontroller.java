package com.example.banking_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Adminlogincontroller {
    Button Backadmin;
    Button loginbtn;
    @FXML
    TextField logintext;
    @FXML
    PasswordField Passfield;
    @FXML
    Label Incorrectlabel;
    String name = "muzamil";
    String pass = "admin";
    Adminpasscontroller adminpasscontroller=new Adminpasscontroller();


    public void adminLoginPageBack(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Landingpage.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void adminLogin(ActionEvent event) throws IOException {
        if (name.equals(logintext.getText())
                && pass.equals(Passfield.getText())) {
            System.out.println("Username: " + logintext.getText() + ", Password: " +Passfield.getText());
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Adminpass.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            adminpasscontroller.topLabel.setText(logintext.getText());
        }
        else {
            Incorrectlabel.setText("Incorrect password or username");
        }

    }
}

