package pl.sda.enums;

public class ColorsExample {
    public static void main(String[] args) {
        Colors white = Colors.WHITE;
//        System.out.println(white.getGreenColor());

        int redColor = white.getRedColor();

        if (white == Colors.RED) {
            System.out.println("true");
        }

        switch (white) {
            case RED:
                System.out.println("czerwony");
                break;
            case BLACK:
                System.out.println("czarny");
                break;
            case WHITE:
                System.out.println("biały");
                break;
        }

        // for (// zmienna referencyjna (typ -> nazwa) : zbiór elementów po których iterujemy) {
        // ...
        // }

        for (Colors color : Colors.values()) {
            System.out.println(color + " -> " + color.getRedColor() + "." + color.getGreenColor() + "." + color.getBlueColor());
        }
    }
}
