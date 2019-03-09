package pl.sda.abstra.foods;

public class FoodTest {
    public static void main(String[] args) {
        Food chicken = new Chicken();
        Food ham = new Ham();
        Food carrot = new Carrot();
        Food salad = new Salad();

        System.out.println("chicken = " + chicken.getTaste());
        System.out.println("ham = " + ham.getTaste());
        System.out.println("carrot = " + carrot.getTaste());
        System.out.println("salad = " + salad.getTaste());
    }
}
