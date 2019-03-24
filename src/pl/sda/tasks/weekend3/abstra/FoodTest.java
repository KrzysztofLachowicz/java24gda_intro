package pl.sda.tasks.weekend3.abstra;

public class FoodTest {
    public static void main(String[] args) {
        Food ham = new Ham("wild boar ham");
        Food chicken = new Chicken("McChicken");
        Food salad = new Salad("green salad");
        Food carrot = new Carrot("young carrot");

        ham.describe();
        chicken.describe();
        salad.describe();
        carrot.describe();

        System.out.println("------------------------");

        Recipe recipe1 = new Recipe("simple sandwich", ham, salad);
        recipe1.printIngredients();
        recipe1.decribe();

        System.out.println("------------------------");

        Recipe recipe2 = new Recipe("vege-chicken", 3);
        recipe2.addIngredient(chicken);
        recipe2.addIngredient(salad);
        recipe2.addIngredient(carrot);
        recipe2.printIngredients();
        recipe2.decribe();
    }
}
