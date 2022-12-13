package com.example.graphicassignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UserApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UserApplication.class.getResource("fxml/user.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 420);
        stage.setResizable(false);
        stage.setTitle("Trolleri Trollera");
        stage.setScene(scene);
        stage.show();
    }
}