package org.example.seminar3.task5;

import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) {
        BinaryOperator<Integer> ob = ((t1, t2) -> (t1 * t2));
        System.out.println(ob.apply(2,3));
        System.out.println(ob.apply(12,11));
    }
}
