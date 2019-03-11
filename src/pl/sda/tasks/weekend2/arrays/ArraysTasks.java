package pl.sda.tasks.weekend2.arrays;

import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args) {
        ArraysTasks tasks = new ArraysTasks();

        // #1
        System.out.println("\n=== #1 ===");
        tasks.printStringArray(new String[]{"a", "ab", "abc", "abcd", "abcde"});

        // #2
        System.out.println("\n=== #2 ===");
        int sum = tasks.sumIntArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("Sum is equal to = " + sum);

        // #3
        System.out.println("\n=== #3 ===");
        int[] arrOfEvens = tasks.createArrayOfEvens(10);
        System.out.println("Array of evens is equal to = " + Arrays.toString(arrOfEvens));

        // #4
        System.out.println("\n=== #4 ===");
        float[] arrOfDoubledFloats = tasks.doubleFloats(new float[]{1.1f, 1.2f, 1.3f, 1.4f, 1.5f});
        System.out.println("Array of doubled floats is equal to = " + Arrays.toString(arrOfDoubledFloats));

        // #5
        System.out.println("\n=== #5 ===");
        tasks.printDoubles(new double[]{});
        tasks.printDoubles(new double[]{1.123});
        tasks.printDoubles(new double[]{99.99, 101.01});
        tasks.printDoubles(new double[]{1.1, 1.2, 1.3, 1.4, 1.5});
        tasks.printDoubles(new double[]{2.0, 5.0, 7.0, 11.0});

        // #6
        System.out.println("\n=== #6 ===");
        Car[] reversedArray = tasks.reverseArrayOfCars(new Car[]{
                new Car("Toyota", "Corolla"),
                new Car("Toyota", "RAV4"),
                new Car("BMW", "3"),
                new Car("Kia", "Ceed"),
                new Car("Ford", "Mustang")
        });
        System.out.println("Reversed array of cars is equal to = " + Arrays.toString(reversedArray));

        // #7
        System.out.println("\n=== #7 ===");
        tasks.printStringArrayVarargs("a", "ab", "abc", "abcd", "abcde");

        int sumVarargs = tasks.sumIntArrayVarargs(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Sum is equal to = " + sumVarargs);

        float[] arrOfDoubledFloatsVarargs = tasks.doubleFloatsVarargs(1.1f, 1.2f, 1.3f, 1.4f, 1.5f);
        System.out.println("Array of doubled floats is equal to = " + Arrays.toString(arrOfDoubledFloatsVarargs));

        tasks.printDoublesVarargs();
        tasks.printDoublesVarargs(1.123);
        tasks.printDoublesVarargs(99.99, 101.01);
        tasks.printDoublesVarargs(1.1, 1.2, 1.3, 1.4, 1.5);
        tasks.printDoublesVarargs(2.0, 5.0, 7.0, 11.0);

        Car[] reversedArrayVarargs = tasks.reverseArrayOfCarsVarargs(
            new Car("Toyota", "Corolla"),
            new Car("Toyota", "RAV4"),
            new Car("BMW", "3"),
            new Car("Kia", "Ceed"),
            new Car("Ford", "Mustang")
        );
        System.out.println("Reversed array of cars is equal to = " + Arrays.toString(reversedArrayVarargs));

        // #8
        System.out.println("\n=== #8 ===");
        int sumOfMultidimentional = tasks.sumIntMultiArray(new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9}, {10, 20, 30}});
        System.out.println("Sum is equal to = " + sumOfMultidimentional);
    }

    // Napisz metodę, która jako parametr przyjmuje zmienną typu String[]
    // i wyświetla wszystkie elementy tablicy na konsoli (użyj różnych rodzajów pętli).
    private void printStringArray(String[] arrOfStrings) {
        int n = 0;
        while (n < arrOfStrings.length) {
            System.out.println(arrOfStrings[n]);
            n++;
        }

        for (int i = 0; i < arrOfStrings.length; i++) {
            System.out.println(arrOfStrings[i]);
        }

        for (String arrOfString : arrOfStrings) {
            System.out.println(arrOfString);
        }
    }

    private void printStringArrayVarargs(String... strings) {
        printStringArray(strings);
    }

    // Napisz metodę, która jako jedyny parametr przyjmuje zmienną typu int[]
    // i zwróci sumę wszystkich elementów tablicy.
    private int sumIntArray(int[] arrOfInts) {
        int sum = 0;
        for (int num : arrOfInts) {
            sum += num;
        }
        return sum;
    }

    private int sumIntArrayVarargs(int... ints) {
        return sumIntArray(ints);
    }

    // Napisz metodę, która jako parametr przyjmuje parametr int count
    // i w wyniku zwraca tablicę wypełnioną liczbami parzystymi zaczynając od 2,
    // tablica ma zawierać ilość liczb wskazanych przez parametr count.
    private int[] createArrayOfEvens(int count) {
        int[] result = new int[count];
        for (int i = 1; i <= count; i++) {
            result[i - 1] = i * 2;
        }
        return result;
    }

    // Napisz metodę, która jako parametr przyjmuje zmienną typu float[]
    // i zwróci tablicę z podwojonymi wartościami tablicy przekazanej do metody
    // (tablica przekazana do metody ma pozostać niezmieniona).
    private float[] doubleFloats(float[] floats) {
        float[] result = new float[floats.length];
        for (int i = 0; i < floats.length; i++) {
            result[i] = floats[i] * 2;
        }
        return result;
    }

    private float[] doubleFloatsVarargs(float... floats) {
        return doubleFloats(floats);
    }

    // Napisz metodę, która jako parametr przyjmuje zmienną typu double[]
    // i wyświetla na konsoli: pierwszy, środkowy i ostatni element tablicy,
    // a także średnią arytmetyczną wszystkich liczb z tabeli.
    private void printDoubles(double[] doubles) {
        if (doubles.length > 0) {
            System.out.println("First element of an array: " + doubles[0]);
            System.out.println("Last element of an array: " + doubles[doubles.length - 1]);
            if (doubles.length > 1) {
                if (doubles.length % 2 == 0) {
                    System.out.println("It's even number of elements, so there is no one element in the middle, two middles are: "
                            + doubles[doubles.length / 2 - 1] + ", " + doubles[doubles.length / 2]);
                } else {
                    System.out.println("Element in the middle: " + doubles[Math.round(doubles.length / 2)]);
                }
            } else {
                System.out.println("Array contains 1 element, so in the middle is: " + doubles[0]);
            }

            double sum = 0.0;
            for (double num : doubles) {
                sum += num;
            }
            System.out.println("Average: " + sum / doubles.length);
        } else {
            System.out.println("Array of doubles is empty!");
        }
    }

    private void printDoublesVarargs(double... doubles) {
        printDoubles(doubles);
    }

    // Napisz metodę, która jako parametr przyjmuje zmienną typu Car[]
    // (klasę Car powinieneś mieć utworzoną w ramach poprzednich zadań)
    // i zwróci tablicę z odwróconą kolejnością elementów.
    private Car[] reverseArrayOfCars(Car[] cars) {
        Car[] result = new Car[cars.length];
        int i = cars.length - 1;
        for (Car car : cars) {
            result[i] = car;
            i--;
        }
        return result;
    }

    private Car[] reverseArrayOfCarsVarargs(Car... cars) {
        return reverseArrayOfCars(cars);
    }

    // Przerób metodę z zadania nr 2 tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][] i liczyła sumę z wszystkich tablic.
    private int sumIntMultiArray(int[][] arrayOfArrays) {
        int sum = 0;
        for (int[] ints : arrayOfArrays) {
            sum += sumIntArray(ints);
        }
        return sum;
    }
}
