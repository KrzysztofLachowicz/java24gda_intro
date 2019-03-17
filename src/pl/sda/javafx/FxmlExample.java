package pl.sda.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class FxmlExample implements Initializable {
    @FXML
    private Button button1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("FxmlExample");

        button1.setOnAction(e -> System.out.println("Button ONE was clicked!"));
    }
}
