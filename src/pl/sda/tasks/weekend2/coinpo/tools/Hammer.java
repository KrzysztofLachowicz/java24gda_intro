package pl.sda.tasks.weekend2.coinpo.tools;

public class Hammer extends Tool {
    private double weight;

    public Hammer(String model, double price, double weight) {
        super(model, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String info() {
        return "Hammer " + super.info() + " and weight = " + weight;
    }
}
