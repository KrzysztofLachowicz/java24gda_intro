package pl.sda.javafx;

import javafx.scene.control.Button;

public class ButtonUtil {
    public static void setOnAction(Button button) {
        button.setOnAction(e -> {
            System.out.println("Button was clicked!");
        });
    }
}
