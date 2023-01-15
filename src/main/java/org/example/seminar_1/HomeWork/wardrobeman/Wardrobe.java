package org.example.seminar_1.HomeWork.wardrobeman;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Wardrobe extends TheDoor {
    //есть шкаф, в нем 3 полки вмещающие 6 вещей
    String[][] shelf = {{"Шапка","Перчатки","Шарф"},{"Рубашка","Носки","Трусы","Штаны"},{"Сапоги","Тапочки","Галоши","Валенки"}};

    public void things() throws InterruptedException {
        for (String[] strings : shelf) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Arrays.toString(strings));
        }
    }

}
