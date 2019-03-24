package pl.sda.tasks.weekend3.stat;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("9 + 5 = " + Math.Operation.add(9, 5));
        System.out.println("9.5 - 3.3 = " + Math.Operation.subtract(9.5, 3.3));
        System.out.println("3.5 * 1.2 = " + Math.Operation.multiply(3.5, 1.2));
        System.out.println("14.5 / 0.5 = " + Math.Operation.divide(14.5, .5));
        System.out.println("max(6.6, 6.7) = " + Math.Compare.max(6.6, 6.7));
        System.out.println("min(3.1, 5.7) = " + Math.Compare.min(3.1, 5.7));
        System.out.println("min(3.2, 3) = " + Math.pow(3.2, 3));
        System.out.println("circleArea(8) = " + Math.circleArea(8));
    }
}
