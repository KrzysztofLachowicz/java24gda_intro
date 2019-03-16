package pl.sda.collections;

import java.util.*;

public class MapTasks {
    public static void main(String[] args) {
        //task 1,2
        //task1And2();
        //task 3
        task3();
    }

    private static void task1And2() {
        Map<Integer, String> numbers = new TreeMap<>();

        numbers.put(0, "zero");
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(-1, "minus one");

        System.out.println("Size of map: " + numbers.size());

        Set<Integer> keys=numbers.keySet();
        int k=0;
        for (Integer key : keys) {
            System.out.println(key + " - " + numbers.get(key));
            if(key<0) k++;
        }
        System.out.println("Mniejsze: " + k + ", większe równe: "+ (numbers.size()-k));
    }

    private static void task3() {
        Map<Integer, String> numbers = new TreeMap<>();

        numbers.put(0, "zero");
        numbers.put(1, "one");
        numbers.put(-2, "minus two");
        numbers.put(2, "two");
        numbers.put(-1, "minus one");
        numbers.put(-3, "minus three");

        List<Integer> negativeNumbes = new ArrayList<>();
        for (Integer key : numbers.keySet()) {
            if(key < 0){
                negativeNumbes.add(key);
            }
        }
        for (Integer negativeNumbe : negativeNumbes) {
            numbers.remove(negativeNumbe);
        }
        System.out.println(numbers);
    }
}
