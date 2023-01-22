package org.example.seminar3.task7;

import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        Function<Integer, String> function = (a -> String.valueOf(a) + " $");
        System.out.println(function.apply(4));
    }
}
