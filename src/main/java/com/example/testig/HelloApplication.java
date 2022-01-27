package com.example.testig;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        stage.setTitle("Titre TP!");
        BorderPane border = new BorderPane();
        Button bouton = new Button("Jouer");
        border.setBottom(bouton);
        bouton.setOnAction(new Ecouteur());
        stage.setScene(new Scene(border, 400, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}