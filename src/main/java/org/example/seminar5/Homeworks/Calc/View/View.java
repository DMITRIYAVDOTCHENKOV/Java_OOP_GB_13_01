package org.example.seminar5.Homeworks.Calc.View;

import java.util.Scanner;

public class View implements IView {
    Scanner in = new Scanner(System.in);

    @Override
    public int choiceOperation() {
        System.out.println("Операция выбора:");
        System.out.println("\t1. Сложение");
        System.out.println("\t2. Вычитание");
        System.out.println("\t3. Умножение");
        System.out.println("\t4. Деление");
        System.out.println("\t5. Выход");
        return in.nextInt();
    }

    @Override
    public int choiceTypeValues() {
        System.out.println("Операция выбора:");
        System.out.println("\t1. Рациональные числа");
        System.out.println("\t2. Комплексные числа");
        System.out.println("\t3. выход");
        return in.nextInt();
    }

    @Override
    public void showResult(String result) {
        System.out.println("Рузультат > " + result);
    }
}
