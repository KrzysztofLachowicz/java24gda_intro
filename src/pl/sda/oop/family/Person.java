package pl.sda.oop.family;

public class Person {
    String name;
    String surnameName;
    int age;

    public Person(String name, String surnameName, int age) {
        this.name = name;
        this.surnameName = surnameName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurnameName() {
        return surnameName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surnameName='" + surnameName + '\'' +
                ", age=" + age +
                '}';
    }
}
