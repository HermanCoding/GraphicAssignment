package com.example.graphicassignment;

import javafx.beans.binding.Bindings;
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

    //TODO Gör så man måste skriva in data i fälten för att få gå vidare.
    public void switchToScene2(ActionEvent event) throws IOException {
        name = textField_name.getText();
        lastname = textField_lastname.getText();
        song = "Never Gonna Give You Up by Rick Astley";
        saveToFile();
        User user = new User(name, lastname, song);
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("fxml/video.fxml")));
        Parent root = loader.load();
        VideoController videoController = loader.getController();
        videoController.userData(user);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn_push.disableProperty().bind(Bindings.isEmpty(textField_name.textProperty()).or(Bindings.isEmpty(textField_lastname.textProperty())));
    }

    //TODO Om tid finns gör så att namnet hamnar högst upp i textfilen.
    public void saveToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt", true));
            writer.write(name + " " + lastname + " really loves the song " + song + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}