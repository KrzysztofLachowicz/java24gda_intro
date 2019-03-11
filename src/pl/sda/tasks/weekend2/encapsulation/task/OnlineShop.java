package pl.sda.tasks.weekend2.encapsulation.task;

import pl.sda.tasks.weekend2.encapsulation.task.items.ItemManager;
import pl.sda.tasks.weekend2.encapsulation.task.items.ItemModel;
import pl.sda.tasks.weekend2.encapsulation.task.users.UserManager;

/**
 * 3. W repozytorium kodu, w pakiecie encapsulation znajduje się kolejny pakiet nazwany task, gdzie jest kilka klas,
 *    które należy uporządkować i utworzyć dla nich odpowiednie pakiety.
 *    To Twoje zadanie. Działaj wyłącznie w obrębie pakietu task.
 */
/**
 * 4. W klasach, które właśnie zostały uporządkowane ktoś popełnił błędy i nie zadbał o prawidłową hermetyzację danych oraz modyfikatory dostępu.
 *    Przejrzyj klasy i postaraj się by kod był zgodny z tym co było powiedziane na zajęciach - przeprojektuj klasy by spełniały zasady hermetyzacji,
 *    a przy tym udostępniały do "świata zewnętrznego" tylko potrzebne API. Zadbaj o prawidłowe użycie danych. Utwórz przykłady użycia w klasie OnlineShop.
 *    Sprawdź, czy Twój kod jest odporny na błędy.
 */
public class OnlineShop {
    public static void main(String[] args) {
        ItemManager itemManager = new ItemManager();
        ItemModel item = itemManager.createShopItem("SmartTv", "FullHD", 1999.99);
        System.out.println("item = " + item);

        UserManager userManager = new UserManager();
        userManager.createUser("Janek", "Dolas", 33);
        System.out.println("user = " + userManager.getUser());

        ShopCart shopCart = new ShopCart();
        shopCart.addItem(item, 3);
        shopCart.buy();
    }
}

