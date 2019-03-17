package pl.sda.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Base64;

public class Base64Encoder extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        TextArea textArea1 = new TextArea();
        TextArea textArea2 = new TextArea();

        textArea1.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode().equals(KeyCode.ENTER)) {
                encode(textArea1, textArea2);
            }
        });

        Button button = new Button("Encode!");
        button.setOnAction(e -> encode(textArea1, textArea2));

        VBox box = new VBox();
        box.setPadding(new Insets(15));
        box.setSpacing(10);
        box.getChildren().addAll(textArea1, button, textArea2);

        primaryStage.setScene(new Scene(box));
        primaryStage.show();
    }

    private void encode(TextArea textArea1, TextArea textArea2) {
        String value = textArea1.getText();
        String encoded = Base64.getEncoder().encodeToString(value.getBytes());
        textArea2.setText(encoded);

        ClipboardContent clipboardContent = new ClipboardContent();
        clipboardContent.putString(encoded);

        Clipboard clipboard = Clipboard.getSystemClipboard();
        clipboard.setContent(clipboardContent);
    }
}
