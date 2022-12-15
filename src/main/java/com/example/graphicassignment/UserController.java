package com.example.graphicassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class UserController implements Initializable {
    String name;
    String lastname;
    String song;
    @FXML
    private Button btn_push;
    @FXML
    private TextField textField_name;
    @FXML
    private TextField textField_lastname;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene2(ActionEvent event) throws IOException {
        name = textField_name.getText();
        lastname = textField_lastname.getText();
        song = "Never Gonna Give You Up by Rick Astley";
        saveToFile();
        User user = new User(name, lastname, song);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/video.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void saveToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt", true));
            writer.append(name + " " + lastname + " really loves the song " + song + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void sendData(javafx.scene.input.MouseEvent mouseEvent) {

        //Typecastar eventet till en Node
        stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.close();
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("fxml/user.fxml")));
            //setUserData är en javaFX metod för att knyta an ett objekt till "class Node". Detta för att kunna använda objektet senare.
            //stage.setUserData(user);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.printf("Error: %s%n", e.getMessage());
        }
    }
}