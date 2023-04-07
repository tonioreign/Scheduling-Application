package com.schedule.schedulingapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SchedulingApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try{
            Parent menu = FXMLLoader.load(getClass().getResource("/fxml/login-form.fxml"));
            Scene scene = new Scene(menu);
            stage.setTitle("Scheduling Application");
            stage.setScene(scene);
            stage.show();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}