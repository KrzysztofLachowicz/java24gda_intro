package pl.sda.enums;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public double calculate(double a, double b) {
        double result = 0.0;
        switch (this) { // wartosc enuma do ktorej sie odwolujemy w miejscu uzycia
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                result = a / b;
                break;
        }

//        switch (symbol) {
//            case "+":
//                result = a + b;
//                break;
//            case "-":
//                result = a - b;
//                break;
//            case "*":
//                result = a * b;
//                break;
//            case "/":
//                result = a / b;
//                break;
//        }

        return result;
    }
}
