package com.example.graphicassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class VideoController implements Initializable {
    @FXML
    private WebView webView = new WebView();
    @FXML
    private TextField text_user;
    @FXML
    VideoApplication videoApplication = new VideoApplication();
    Thread videoThread = new Thread(videoApplication);
    private Stage stage;
    private Scene scene;
    private Parent root;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        videoApplication.InitializeVideoApplication(webView);
        videoThread.start();
    }

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/user.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public void openScene3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/log.fxml")));
        stage = new Stage();
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Log");
        stage.show();
    }
    @FXML
    private void receiveData(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        User u = (User) stage.getUserData();
        String name = u.getName();
        String lastName = u.getLastName();
    }
}
