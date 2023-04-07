package com.schedule.schedulingapplication.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private AnchorPane LoginAnchor;

    @FXML
    private TextField UserField;

    @FXML
    private Label LoginLabel;

    @FXML
    private Label UserLabel;

    @FXML
    private TextField PassField;

    @FXML
    private Label PassLabel;

    @FXML
    private Button LoginButton;

    @FXML
    private Button ExitButton;

    @FXML
    private Label TimeLabel;

    @FXML
    private Label SetTimeLabel;

    @FXML
    void onExitButton(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void onLoginButton(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
