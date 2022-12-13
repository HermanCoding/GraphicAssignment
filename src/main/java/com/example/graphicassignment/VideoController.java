package com.example.graphicassignment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class VideoController implements Initializable {
    public WebView webView = new WebView();
    public TextField text_user;
    VideoApplication videoApplication = new VideoApplication();
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
        Thread videoThread = new Thread(videoApplication);
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

    @FXML
    private void onClick_btn_back() {

    }
}
