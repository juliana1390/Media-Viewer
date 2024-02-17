package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author juliana
 */
public class Controller implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private MediaView mediaViewer;

    @FXML
    private Button openFileButton;

    @FXML
    private Button playButton;

    @FXML
    private Button pauseButton;

    @FXML
    private Button resetButton;

    private String filePath;

    @FXML
    void backgroundPane(MouseEvent event) {
        //
    }

    @FXML
    void openFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a File:");
        File selectedFile = fileChooser.showOpenDialog(new Stage());
        if (selectedFile != null) {
            filePath = selectedFile.getAbsolutePath();
        } else {
            Warning warning = new Warning();
            warning.showAlert("File not found!");
        }
    }

    @FXML
    void playMedia(ActionEvent event) {
        //
    }

    @FXML
    void pauseMedia(ActionEvent event) {
        //
    }

    @FXML
    void resetMedia(ActionEvent event) {
        //
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //
    }
}
