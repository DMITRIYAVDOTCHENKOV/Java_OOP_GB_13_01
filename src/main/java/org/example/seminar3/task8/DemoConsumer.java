package org.example.seminar3.task8;

public class DemoConsumer {
    public static void main(String[] args) {

        Consumer<Integer> print = (t -> System.out.printf("%d долларов \n",t));
        print.assept(600);
    }
}
