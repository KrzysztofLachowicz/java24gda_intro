package pl.sda.tasks.weekend1.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
    Zmodyfikuj klasę HelloWorldFx:
    Zmień tekst przycisku
    Zmień tekst dla obiektu typu Label

    Dodaj do klasy HelloWorldFx kontrolki typu:
    TextField
    Button
    Label

    Spraw by po kliknięciu przycisku dodanego w pkt. 2 tekst wpisany do kontrolki typu TextField został skopiowany do kontrolki typu Label.

 */
public class HelloWorldFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("First steps with JavaFX!");

        Button button = new Button("This is button!");
        button.setOnAction(e -> System.out.println("Button was clicked!"));

        Separator separator = new Separator();
        separator.setPadding(new Insets(20, 10, 20, 10));

        TextField textField = new TextField();
        Label labelForTextField = new Label();
        Button buttonForTextField = new Button("Copy TextField value to Label below");
        buttonForTextField.setOnAction(e -> labelForTextField.setText(textField.getText()));

        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label, button, separator, textField, buttonForTextField, labelForTextField);

        primaryStage.setTitle("Hello World - JavaFX");
        primaryStage.setScene(new Scene(box, 300, 200));
        primaryStage.show();
    }
}
