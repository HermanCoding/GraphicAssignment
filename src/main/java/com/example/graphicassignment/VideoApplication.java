package com.example.graphicassignment;

import javafx.application.Platform;
import javafx.scene.web.WebView;

public class VideoApplication implements Runnable, VideoInterface {
    private WebView webView;

    public void InitializeVideoApplication(WebView webView) {
        this.webView = webView;
    }

    @Override
    public void run() {
        // Avoid throwing IllegalStateException by running from a non-JavaFX thread.
        Platform.runLater(() -> Video());
    }

    @Override
    public void Video() {
        webView.getEngine().load("https://streamable.com/e/shil2");
        webView.setMaxSize(640, 360);
    }
}

