package com.example.graphicassignment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LogController implements Initializable {

    @FXML
    private TextArea textArea;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("user.txt"));
            String line;
            while ((line=reader.readLine()) != null){
                textArea.appendText(line+"\n\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}