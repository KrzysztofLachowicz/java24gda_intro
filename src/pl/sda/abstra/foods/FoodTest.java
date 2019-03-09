package pl.sda.abstra.foods;

public class FoodTest {
    public static void main(String[] args) {
        Food chicken = new Chicken("Kurczak");
        Food ham = new Ham("Szynka");
        Food carrot = new Carrot("Marchew");
        Food salad = new Salad("Sałata");

        Food[] foods = {chicken, ham, carrot, salad};
        for(Food food: foods) {
            System.out.println(food.getName() + " = " + food.getTaste()+ ", type: " + food.getType());
        }
    }
}
