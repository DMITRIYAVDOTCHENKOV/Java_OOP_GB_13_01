package org.example.seminar.seminar_1.HomeWork.wardrobeman;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Man extends Wardrobe {
    String name;

    public Man(String name) {
        this.name = name;
    }

    public void go() {
        System.out.println(name + " Идет к шкафу за вещами");
    }

    public void openDoor() {
        System.out.println("Надо попытаться открыть дверь.");
    }

    public void searchingForThingsInTheCloset() throws InterruptedException {
        things();
    }

    public void getBressed() throws InterruptedException {
        System.out.println("Одеваемся берем : ");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(Arrays.toString(shelf[0][2].split(",")));
        TimeUnit.SECONDS.sleep(1);
        System.out.println(Arrays.toString(shelf[1][1].split(",")));
        TimeUnit.SECONDS.sleep(1);
        System.out.println(Arrays.toString(shelf[2][0].split(",")));
    }

}
