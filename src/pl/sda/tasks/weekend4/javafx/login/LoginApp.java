package pl.sda.tasks.weekend4.javafx.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * 3. Utwórz program, który wymaga zalogowania się po starcie za pomocą nazwy użytkownika i hasła zdefiniowanych po stronie aplikacji.
 * Po pomyślnym zalogowaniu aplikacja wyświetli komunikat.
 */
public class LoginApp extends Application {
    public static String LAYOUTS_DIR = "views";
    public static String LOGIN_LAYOUT_NAME = "login.fxml";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(resolveLayoutPath(LoginApp.LOGIN_LAYOUT_NAME)));
        primaryStage.setTitle("LoginApp");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private String resolveLayoutPath(String layoutName) {
        return LoginApp.LAYOUTS_DIR + "/" + layoutName;
    }
}
