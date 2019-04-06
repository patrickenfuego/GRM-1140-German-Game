package com.germanproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import java.net.URL;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gui/MainController.fxml"));
        Parent rootPane = loader.load();
        Scene scene = new Scene(rootPane);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Willkommen beim Deutschen Quizspiel");
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        //launch the application
        launch(args);
    }
}
