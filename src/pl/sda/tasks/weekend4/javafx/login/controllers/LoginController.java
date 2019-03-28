package pl.sda.tasks.weekend4.javafx.login.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    private static final String USERNAME = "SDA";
    private static final String PASSWORD = "@SDA!";

    @FXML
    private Text info;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button button;

    @FXML
    private Text message;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        info.setText("Login with your username and password");
        username.setPromptText("Username");
        password.setPromptText("Password");
        button.setOnAction(e -> login());
        message.setFill(Color.RED);
    }

    private void login() {
        message.setText("");
        if (username.getText().equals(USERNAME) || password.getText().equals(PASSWORD)) {
            new LoginAlertWindow("Succcess", "You've successfully logged in.");
        } else {
            message.setText("Wrong credentials!");
        }
    }
}
