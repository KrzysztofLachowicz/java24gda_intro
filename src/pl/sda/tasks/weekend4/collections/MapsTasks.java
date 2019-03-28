package pl.sda.tasks.weekend4.collections;

import pl.sda.collections.Product;

import java.util.*;

public class MapsTasks {
    public static void main(String[] args) {
        //zadanie 1
        Map<Integer, String> map = task1();

        //zadanie 2
        System.out.println("--------------------");
        task2(map);

        //zadanie 3
        System.out.println("--------------------");
        task3(map);

        //zadanie 4
        System.out.println("--------------------");
        Product product1 = new Product(7, "Smart TV");
        Product product2 = new Product(2, "Radio");
        Product product3 = new Product(1, "Router");
        Product product4 = new Product(9, "Washing machine");
        List<Product> products = Arrays.asList(product1, product2, product3, product4);
        System.out.println("products = " + products);
        Map<Integer, Product> productMap = task4(products);
        System.out.println("productMap = " + productMap);
    }

    /**
     * 1. Stwórz mapę, która jako klucze będzie zawierała obiekty Integer, a jako wartości obiekty typu String.
     * Wypisz na konsolę rozmiar mapy oraz wszystkie wartości (klucz - wartość).
     */
    private static Map<Integer, String> task1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(-10, "Moskwa");
        map.put(-2, "Warszawa");
        map.put(0, "Berlin");
        map.put(10, "Paryż");
        map.put(25, "Ateny");

        System.out.println("Map size = " + map.size());
        for(Integer key : map.keySet()) {
            System.out.printf("%3d - %s%n", key, map.get(key));
        }

        return map;
    }

    /**
     * 2. Policz w mapie z pkt 1 (za pomocą pętli) ilość kluczy, które mają wartość mniejszą od zera oraz takich które mają wartość większą lub równą zeru.
     * Wypisz wyniki na ekran.
     */
    private static void task2(Map<Integer, String> map) {
        int lowerThanZero = 0;
        int higherOrEqualThanZero = 0;

        for(Integer key : map.keySet()) {
            if(key < 0) {
                lowerThanZero++;
            } else {
                higherOrEqualThanZero++;
            }
        }

        System.out.println("lowerThanZero = " + lowerThanZero);
        System.out.println("higherOrEqualThanZero = " + higherOrEqualThanZero);
    }

    /**
     * 3. Z mapy stworzonej w pkt 1 wyciągnij wszystkie klucze, które mają wartość mniejszą od zera i dodaj je do nowej listy obiektów Integer.
     * Następnie usuń z mapy wszystkie wartości, których klucze znajdują się w liście.
     * Wypisz wszystkie pozostałe wartości mapy (klucz - wartość) na ekran.
     */
    private static void task3(Map<Integer, String> map) {
        List<Integer> keysToDelete = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if(key < 0) {
                keysToDelete.add(key);
            }
        }

        for (Integer key : keysToDelete) {
            map.remove(key);
        }

        System.out.println("Map after removal");
        for(Integer key : map.keySet()) {
            System.out.printf("%3d - %s%n", key, map.get(key));
        }
    }

    /**
     * 4. Stwórz metodę, która jako parametr przyjmie listę obiektów pl.sda.collections.Product i
     * zwróci mapę gdzie kluczem będzie id produktu a wartością obiekt klasy Product.
     */
    private static Map<Integer, Product> task4(List<Product> products) {
        Map<Integer, Product> productMap = new HashMap<>();
        //a. zmień implementację mapy tak żeby kolejność produktów w mapie odpowiadała kolejności z listy wejściowej
        //Map<Integer, Product> productMap = new LinkedHashMap<>();
        //b. zmień implementację mapy tak żeby kolejność produktów w mapie odpowiadała kolejności z listy wejściowej
        //Map<Integer, Product> productMap = new TreeMap<>();

        for (Product product : products) {
            productMap.put(product.getId(), product);
        }

        return productMap;
    }
}