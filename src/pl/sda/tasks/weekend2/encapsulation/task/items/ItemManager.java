package pl.sda.tasks.weekend2.encapsulation.task.items;

public class ItemManager {
    public ItemModel createShopItem(String title, String description, double price) {
        return new ItemModel(title, description, price);
    }
}
