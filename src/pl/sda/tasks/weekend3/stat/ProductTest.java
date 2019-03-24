package pl.sda.tasks.weekend3.stat;

public class ProductTest {
    public static void main(String[] args) {
        Product tv = new Product("SmartTv", 1000);
        Product radio = new Product("RadioCd", 400);
        Product phone = new Product("SmartPhone", 705.5);
        Product oldPhone = new Product("OldPhone", 99);
        Product laptop = new Product("SuperLaptop", 1006.99);

        printProducts(tv, radio, phone, oldPhone, laptop);
    }

    private static void printProducts(Product... products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
