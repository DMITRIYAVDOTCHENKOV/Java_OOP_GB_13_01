package org.example.seminar_1;

public class Animals {
    private String name;

    void speak() {
        System.out.println("Не могу говорить");
    }

    String getName() {
        return this.name;
    }
}

class Cat extends Animals {
    @Override
    void speak() {
        System.out.println("Мяу");
    }
}

class Tests {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animals cat2 = new Animals();
        cat.speak();
        cat2.speak();
    }
}
