package pl.sda.enums;

public class OperationTest {
    public static void main(String[] args) {
        double calculate = Operation.PLUS.calculate(1.1, 2.2);
        System.out.println("Operation PLUS result = " + calculate);
    }
}
