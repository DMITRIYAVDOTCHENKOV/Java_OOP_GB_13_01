package org.example.seminar3.task4;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(-4));
    }
}
