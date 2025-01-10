package com.example.tp8_exercice1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //PAGE CONNEXION

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 340);

        stage.setTitle("Formulaire d'authentification");
        stage.setScene(scene);
        stage.show();

        //BUTTON

//        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("inscription-view.fxml"));
//        Scene scene2 = new Scene(fxmlLoader.load(), 420, 340);

        //PAGE INSCRIPTION
//        stage.setTitle("Formulaire d'inscription");

    }

    public static void main(String[] args) {
        launch(args);
    }

}