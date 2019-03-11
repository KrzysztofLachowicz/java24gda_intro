package pl.sda.tasks.weekend2.coinpo.tools;

/**
 * Utwórz klasę ShoppingCart, która będzie reprezentować koszyk z zakupami.
 * Wewnątrz klasy dodaj pole ze zmienną tablicową która będzie przechowywać wybrane produkty
 * (powiedzmy, że maksymalnie można zakupić 10 narzędzi).
 * Dodaj metody do dodawania narzędzi, do wyświetlania ich listy i metodę która zwróci łączną sumę zakupów.
 */
public class ShoppingCart {
    private final int MAX = 10;
    private int size = 0;
    private Tool[] list = new Tool[MAX];

    public void add(Tool tool) {
        if (size == MAX) {
            System.out.println("You can add maximum " + MAX + " items to your shopping card.");
        } else {
            list[size] = tool;
            size++;
        }
    }

    public void display() {
        System.out.println("Shopping cart: ");
        for (int i = 0; i < size; i++) {
            System.out.println(list[i].info());
        }
    }

    public double getFinalPrice() {
        double finalPrice = 0.0;
        for (int i = 0; i < size; i++) {
            finalPrice += list[i].getPrice();
        }
        return finalPrice;
    }
}
