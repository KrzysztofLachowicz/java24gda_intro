package pl.sda.enums;

public enum Colors {
    // wartości enuma `Colors`
    RED(255, 0, 0),
    WHITE(255, 255, 255),
    BLACK(0, 0, 0);

    // pola dodatkowo opisujące wartości enuma
    private int redColor;
    private int greenColor;
    private int blueColor;

    // konstruktor enuma
    Colors(int redColor, int greenColor, int blueColor) {
        this.redColor = redColor;
        this.greenColor = greenColor;
        this.blueColor = blueColor;
    }

    // metoda ustawiajaca kolor czerwony dla pola `redColor`
    public int getRedColor() {
        return redColor;
    }

    // metoda ustawiajaca kolor zielony dla pola `greenColor`
    public int getGreenColor() {
        return greenColor;
    }

    // metoda ustawiajaca kolor niebieski dla pola `blueColor`
    public int getBlueColor() {
        return blueColor;
    }
}
