package pl.sda.livecoding.strings;

import pl.sda.oop.family.Person;

import java.time.LocalDate;

public class StringTest {
    public static void main(String[] args) {
        String text1 = new String("Hello!");
        String text2 = "Hello!";
        String text3 = "Hello!";

        System.out.println(12 + 4);
        System.out.println(12 + text1);
        System.out.println(1 + 3 + " " + text1 + " " + 3 + 4);

        LocalDate today = LocalDate.now();
        Person person = new Person("Jan", "Kowalski", 33);
        System.out.println("Witaj: " + person + ", dzisiaj jest: " + today);

        System.out.println("text1 == text2: " + (text1 == text2));
        System.out.println("text1.equals(text2): " + text1.equals(text2));

        System.out.println("text2 == text3: " + (text2 == text3));
        System.out.println("text2.equals(text3): " + text2.equals(text3));

        System.out.println("text2 update: " + text2.toUpperCase());
        System.out.println("text2: " + text2);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" ").append("World ").append(10);
        String string1 = stringBuilder.toString();
    }
}
