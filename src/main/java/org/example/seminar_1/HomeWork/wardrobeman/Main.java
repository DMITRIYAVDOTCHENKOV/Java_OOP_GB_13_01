package org.example.seminar_1.HomeWork.wardrobeman;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Man man = new Man("Dima");
        Wardrobe wardrobe = new Wardrobe();
        man.go();
        TimeUnit.SECONDS.sleep(2);
        man.openDoor();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Замок");
        TimeUnit.SECONDS.sleep(2);
        man.weBeginToSelectTheCode();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Посмотрим что оу нас тут есть");
        TimeUnit.SECONDS.sleep(2);
        man.searchingForThingsInTheCloset();
        TimeUnit.SECONDS.sleep(2);
        man.getBressed();


    }
}
