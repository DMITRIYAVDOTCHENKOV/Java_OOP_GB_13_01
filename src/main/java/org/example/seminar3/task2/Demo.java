package org.example.seminar3.task2;

public class Demo {
    public static void main(String[] args) {
        Inter f = (n) -> {
            int res = 1;
            n = n < 0 ? -n : n;
            for (int i = 2; i < n / i; i++) {
                if ((n % i) == 0) {
                    res = i;
                    break;
                }
            }
            return res;
        };
        System.out.println("Наименьшим делителем 12 является " + f.func(12));
        System.out.println("Наименьшим делителем 11 является " + f.func(11));
    }
}

