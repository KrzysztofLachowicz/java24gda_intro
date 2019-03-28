package pl.sda.tasks.weekend4.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Base64;

/**
 * 1. Utwórz aplikację, która zaszyfruje podany ciąg znaków algorytmem base64 oraz wyświetli wynik w postaci łatwej do skopiowania.
 */
public class Base64Encoder extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextArea textArea = new TextArea();
        textArea.setMinHeight(200);
        textArea.setMaxHeight(200);

        Text text = new Text();
        text.setWrappingWidth(450);

        Button copyButton = new Button("Copy!");
        copyButton.setVisible(false);
        copyButton.setOnAction(e -> addToClipboard(text.getText()));

        Button encodeButton = new Button("Encode!");
        encodeButton.setOnAction(e -> {
            text.setText(encodeToBase64(textArea.getText()));
            copyButton.setVisible(true);
        });

        ScrollPane scrollPane = new ScrollPane(text);
        scrollPane.setMinViewportHeight(200);

        VBox box = new VBox();
        box.getChildren().addAll(textArea, encodeButton, scrollPane, copyButton);

        primaryStage.setTitle("Base64 Encoder");
        primaryStage.setScene(new Scene(box, 500, 500));
        primaryStage.show();
    }

    private String encodeToBase64(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

    private void addToClipboard(String text) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(text);
        clipboard.setContent(content);
    }
}
