/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author juliana
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // configure screen
            stage.setTitle("Media Viewer");

            // load screen
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/Scene.fxml"));
            Parent xmlFile = loader.load();

            // assing
            Scene controllerScene = new Scene(xmlFile);
            stage.setScene(controllerScene);

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
