package com.example.graphicassignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class UserApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/user.fxml")));
        Scene scene = new Scene(root, 640, 420);
        String css = Objects.requireNonNull(this.getClass().getResource("style.css")).toExternalForm();
        //Platform.setImplicitExit(false); //Makes program continue running even if you close the program window.
        stage.setResizable(false);
        scene.getStylesheets().add(css);
        stage.setTitle("Trolleri Trollera");
        stage.setScene(scene);
        stage.show();
    }
}