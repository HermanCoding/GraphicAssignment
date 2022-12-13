package com.example.graphicassignment;

import javafx.application.Platform;
import javafx.scene.web.WebView;

public class VideoApplication implements Runnable {
    private WebView webView;

    public void InitializeVideoApplication(WebView webView) {
        this.webView = webView;
    }

    @Override
    public void run() {
        // Avoid throwing IllegalStateException by running from a non-JavaFX thread.
        Platform.runLater(
                () -> {
                    webView.getEngine().load("https://streamable.com/e/shil2");
                    webView.setPrefSize(640, 360);
                }
        );

    }
}

