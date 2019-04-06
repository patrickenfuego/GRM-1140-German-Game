package com.germanproject;

import com.germanproject.gui.utils.DialogBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gui/MainController.fxml"));
            Parent rootPane = loader.load();
            Scene scene = new Scene(rootPane);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.setTitle("Willkommen beim Deutschen Quizspiel");
            primaryStage.show();
        }
        catch (Exception e)
        {
            DialogBox.showException("Fatal Error", "Error Opening Main Window. Closing...", e);
            System.err.println("Error opening main window " + e.toString());
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        //launch the application
        launch(args);
    }
}
