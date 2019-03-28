package pl.sda.tasks.weekend4.javafx;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * 2. Utwórz w pełni działający kalkulator dla działań: +, -, * oraz /.
 */
public class Calculator extends Application {
    private static final String[][] template = {
            {"7", "8", "9", "/"},
            {"4", "5", "6", "*"},
            {"1", "2", "3", "-"},
            {"0", "c", "=", "+"}
    };

    private DoubleProperty stackValue = new SimpleDoubleProperty();
    private DoubleProperty value = new SimpleDoubleProperty();

    private enum Operation {
        NOOP,
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    private Operation curOperation = Operation.NOOP;
    private Operation stackOperation = Operation.NOOP;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField screen = createScreen();
        TilePane buttons = createButtons();

        primaryStage.setTitle("Calculator");
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(createLayout(screen, buttons)));
        primaryStage.show();
    }

    private VBox createLayout(TextField screen, TilePane buttons) {
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().setAll(screen, buttons);
        screen.prefWidthProperty().bind(buttons.widthProperty());
        return layout;
    }

    private TextField createScreen() {
        TextField screen = new TextField();
        screen.setAlignment(Pos.CENTER_RIGHT);
        screen.setEditable(false);
        screen.textProperty().bind(Bindings.format("%.0f", value));
        return screen;
    }

    private TilePane createButtons() {
        TilePane buttons = new TilePane();
        buttons.setVgap(7);
        buttons.setHgap(7);
        buttons.setPrefColumns(template[0].length);
        for (String[] r : template) {
            for (String s : r) {
                buttons.getChildren().add(createButton(s));
            }
        }
        return buttons;
    }

    private Button createButton(String s) {
        Button button = makeStandardButton(s);

        if (s.matches("[0-9]")) {
            makeNumericButton(s, button);
        } else {
            ObjectProperty<Operation> triggerOp = determineOperand(s);
            if (triggerOp.get() != Operation.NOOP) {
                makeOperandButton(button, triggerOp);
            } else if ("c".equals(s)) {
                makeClearButton(button);
            } else if ("=".equals(s)) {
                makeEqualsButton(button);
            }
        }

        return button;
    }

    private ObjectProperty<Operation> determineOperand(String s) {
        ObjectProperty<Operation> triggerOp = new SimpleObjectProperty<>(Operation.NOOP);
        switch (s) {
            case "+":
                triggerOp.set(Operation.ADD);
                break;
            case "-":
                triggerOp.set(Operation.SUBTRACT);
                break;
            case "*":
                triggerOp.set(Operation.MULTIPLY);
                break;
            case "/":
                triggerOp.set(Operation.DIVIDE);
                break;
        }
        return triggerOp;
    }

    private void makeOperandButton(Button button, ObjectProperty<Operation> triggerOp) {
        button.setOnAction(actionEvent -> curOperation = triggerOp.get());
    }

    private Button makeStandardButton(String s) {
        Button button = new Button(s);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return button;
    }

    private void makeNumericButton(String s, Button button) {
        button.setOnAction(actionEvent -> {
            if (curOperation == Operation.NOOP) {
                value.set(value.get() * 10 + Integer.parseInt(s));
            } else {
                stackValue.set(value.get());
                value.set(Integer.parseInt(s));
                stackOperation = curOperation;
                curOperation = Operation.NOOP;
            }
        });
    }

    private void makeClearButton(Button button) {
        button.setOnAction(actionEvent -> value.set(0));
    }

    private void makeEqualsButton(Button button) {
        button.setOnAction(actionEvent -> {
            switch (stackOperation) {
                case ADD:
                    value.set(stackValue.get() + value.get());
                    break;
                case SUBTRACT:
                    value.set(stackValue.get() - value.get());
                    break;
                case MULTIPLY:
                    value.set(stackValue.get() * value.get());
                    break;
                case DIVIDE:
                    value.set(stackValue.get() / value.get());
                    break;
            }
        });
    }
}
