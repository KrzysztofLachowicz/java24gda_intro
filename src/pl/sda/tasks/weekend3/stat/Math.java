package pl.sda.tasks.weekend3.stat;

public class Math {
    private static final double PI = 3.14;

    private Math() {
    }

    public static class Operation {
        public static double add(double a, double b) {
            return a + b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            return a / b;
        }
    }

    public static class Compare {
        public static double min(double a, double b) {
            if (a < b) {
                return a;
            }

            return b;
        }

        public static double max(double a, double b) {
            if (a > b) {
                return a;
            }

            return b;
        }
    }

    public static double pow(double a, double b) {
        double result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

}
