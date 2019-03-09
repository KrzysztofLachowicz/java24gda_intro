package pl.sda.coinpo.toolshop;

public class Hammer extends Tool {
   private double weight;

    public Hammer(String model, double price, double weight) {
        super(model, price);
        this.weight = weight;
    }

    public String description(){
        return super.description() + " hammer weight: " + weight;
    }
}
