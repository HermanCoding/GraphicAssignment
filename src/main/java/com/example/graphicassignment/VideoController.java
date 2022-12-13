package com.example.graphicassignment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class VideoController implements Initializable {
    public WebView webView;
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
        WebView webview = new WebView();
        webview.getEngine().load( "https://streamable.com/e/shil2");

        webview.setPrefSize(640, 390);
    }
    @FXML
    private void onClick_btn_stop(){

    }
    @FXML
    private void onClick_btn_play(){

    }
    @FXML
    private void onClick_btn_log(){

    }
    @FXML
    private void onClick_btn_back(){

    }
}
