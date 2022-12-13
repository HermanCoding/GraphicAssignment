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
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class VideoController implements Initializable {
    public WebView webView = new WebView();
    public TextField text_user;
    VideoApplication videoApplication = new VideoApplication();
    Thread videoThread = new Thread(videoApplication);
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button btn_play;
    @FXML
    private Button btn_stop;
    @FXML
    private Button btn_log;
    @FXML
    private Button btn_back;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        videoApplication.InitializeVideoApplication(webView);
        videoThread.start();
    }

    @FXML
    private void onClick_btn_stop() {

    }

    @FXML
    private void onClick_btn_play() {

    }

    @FXML
    private void onClick_btn_log() {

    }

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/user.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
