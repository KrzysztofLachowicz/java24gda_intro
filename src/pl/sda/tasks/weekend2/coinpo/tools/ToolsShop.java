package pl.sda.tasks.weekend2.coinpo.tools;

/**
 * Utwórz klasę Tool, która będzie reprezentować narzędzia do kupienia w sklepie.
 * Każde narzędzie powinno mieć swój model i cenę.
 * Dodatkowo utwórz klasy: Hammer i Saw, które będą dziedziczyć po klasie Tool.
 * Klasa Hammer powinna mieć dodatkowe pole z wagą młotka, a klas Saw z długością piły.
 * Utwórz klasę ToolsShop w której utworzysz kilka narzędzi i wyświetlisz ich ceny.
 *
 * Dodaj do klasy Tool metodę która zwraca opis narzędzia (model + cena).
 * Dodatkowo klasy Hammer i Saw powinny rozszerzać opis o swoje unikatowe cechy.
 */
public class ToolsShop {
    public static void main(String[] args) {
        Hammer hammer1 = new Hammer("THOR 01", 1000, 10000000);
        Hammer hammer2 = new Hammer("R2D2", 22, 42);
        Saw saw = new Saw("Cut the edge", 999, 50);

        System.out.println(hammer1.getModel() + " price is: " + hammer1.getPrice());
        System.out.println(hammer2.getModel() + " price is: " + hammer2.getPrice());
        System.out.println(saw.getModel() + " price is: " + saw.getPrice());

        System.out.println(hammer1.info());
        System.out.println(hammer2.info());
        System.out.println(saw.info());

        System.out.println("\n===\n");

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(hammer1);
        shoppingCart.add(hammer2);
        shoppingCart.add(saw);

        shoppingCart.display();

        System.out.println("Final price for you shopping cart is = " + shoppingCart.getFinalPrice());
    }
}
