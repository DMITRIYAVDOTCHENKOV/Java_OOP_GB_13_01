package org.example.seminar.seminar_1.HomeWork.wardrobeman;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TheDoor {
    static final int COD_NUMBER = 38;

    Random random = new Random();


    enum Door {
        OPEN,
        CLOSE;
    }


    public boolean theFirstDigitOfTheCode() throws InterruptedException {
        int i = 0;
        int cod1 = random.nextInt(10) + 1;
        while (cod1 != COD_NUMBER / 10) {
            cod1 = random.nextInt(10) + 1;
            i++;
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.printf("Ура!!, первую цивру кода подобрали с %d попытки.\nПервая цифра = %d\n", i, cod1);

        return true;
    }

    public boolean theSecondDigitOfTheCode() throws InterruptedException {
        int b = 0;
        int cod2 = random.nextInt(10) + 1;
        while (cod2 != COD_NUMBER % 10) {
            cod2 = random.nextInt(10) + 1;
            b++;
            System.out.println(b);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.printf("Ура!!, вторую цивру кода подобрали с %d попытки.\nВторая цифра = %d\n", b, cod2);

        return true;
    }

    public void weBeginToSelectTheCode() throws InterruptedException {
        theFirstDigitOfTheCode();
        theSecondDigitOfTheCode();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Наш код - " + COD_NUMBER);
        System.out.println("ввожу....");
        System.out.println("Замок открыт");
    }
}

