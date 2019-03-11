package pl.sda.tasks.weekend2.enums;

/**
 * 4. Dodaj do enum Operation metodę calculate(double a, double b), która dla dwóch podanych liczb
 * wykona odpowiednią operację matematyczną oraz wyświetli jej wywołanie w "ładny" sposób na konsoli.
 * Zadbaj o przykład użycia i wykonanie kilku operacji matematycznych.
 *
 * 6. Zadbaj by można było na bazie reprezentacji tekstowej ("+" itp)  znaleźć odpowiednią wartość enum Operation.
 */
public class OperationTest {
    public static void main(String[] args) {
        Operation.PLUS.calculate(4.4, 5.1);
        Operation.MINUS.calculate(6.1, .5);
        Operation.MULTIPLY.calculate(1.3, .5);
        Operation.DIVIDE.calculate(11.5, 1.5);

        System.out.println("Operation.valueOf(\"*\") = " + Operation.ofSymbol("*"));
        System.out.println("Operation.valueOf(\"&\") = " + Operation.ofSymbol("&"));
    }
}
