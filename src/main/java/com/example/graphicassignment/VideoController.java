package com.example.graphicassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class VideoController implements Initializable {
    @FXML
    VideoApplication videoApplication = new VideoApplication();
    Thread videoThread = new Thread(videoApplication);
    @FXML
    private WebView webView = new WebView();
    @FXML
    private Label text_user;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void userData(User user) {
        String name = user.getName();
        String lastName = user.getLastName();
        String song = user.getSong();
        text_user.setText("Hej "+ name +" "+ lastName +" !!!\n" +
                "och din absoluta favoritlåt är: \n"+ song);
    }

    //TODO gör så att tråden stoppar om man lämnar scenen.
    @Override
    public void initialize(URL location, ResourceBundle resources) {



        videoApplication.InitializeVideoApplication(webView);
        videoThread.isDaemon();
        videoThread.start();
    }

    public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/user.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public void openScene3() throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/log.fxml")));
        stage = new Stage();
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Log");
        stage.show();
    }
}
