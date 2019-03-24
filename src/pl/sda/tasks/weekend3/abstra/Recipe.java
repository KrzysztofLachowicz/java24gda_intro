package pl.sda.tasks.weekend3.abstra;

public class Recipe {
    private String name;
    private Food[] ingredients;

    public Recipe(String name, Food... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Recipe(String name, int ingredientsCount) {
        this.name = name;
        this.ingredients = new Food[ingredientsCount];
    }

    public Recipe addIngredient(Food food) {
        int id = findEmptyIndex();
        if(id < ingredients.length) {
            ingredients[id] = food;
        } else {
            System.out.println("Ingredients array is full!");
        }

        return this;
    }

    public void printIngredients() {
        System.out.printf("\nIngredients for %s are: ", name);
        for (Food ingredient : ingredients) {
            System.out.print(ingredient.getName() + ", ");
        }
    }

    public void decribe() {
        System.out.printf("\nDescripion of %s:\n", name);
        for (Food ingredient : ingredients) {
            ingredient.describe();
        }
    }

    private int findEmptyIndex() {
        for (int i = 0; i < ingredients.length; i++) {
            if(ingredients[i] == null) {
                return i;
            }
        }

        return ingredients.length;
    }
}
