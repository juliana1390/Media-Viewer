package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;

/**
 *
 * @author juliana
 */
public class Controller {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private MediaView mediaViewer;

    @FXML
    private Button playButton;

    @FXML
    private Button pauseButton;

    @FXML
    private Button resetButton;

    @FXML
    void backgroundPane(MouseEvent event) {
        //
    }

    @FXML
    void pauseMedia(ActionEvent event) {
        //
    }

    @FXML
    void playMedia(ActionEvent event) {
        //
    }

    @FXML
    void resetMedia(ActionEvent event) {
        //
    }

}

