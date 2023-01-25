package org.example.seminar3.task6;

import java.util.function.UnaryOperator;

public class Demounary {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (a -> a * a);
        System.out.println(unaryOperator.apply(5));
        System.out.println(unaryOperator.apply(8));
    }
}
