package pl.sda.tasks.weekend2.coinpo.tools;

public class Tool {
    private String model;
    private double price;

    public Tool(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String info() {
        return "Tool - `" + model + "` with the price = " + price;
    }
}
