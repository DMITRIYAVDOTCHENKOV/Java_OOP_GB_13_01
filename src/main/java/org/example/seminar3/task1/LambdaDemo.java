package org.example.seminar3.task1;

public class LambdaDemo {
    public static void main(String[] args) {
        NumericTest isFactor = (n, m) -> (n % m) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("2 это делитель на 10");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 ек делитель 10");
        }
        System.out.println(" ");

        NumericTest isFactor2 = (m, n) -> (n < m);
        if (isFactor2.test(2, 10)) {
            System.out.println("2 < 10");
        }
        if (!isFactor2.test(10, 2)) {
            System.out.println("10 !< 2");
        }
        System.out.println(" ");


        NumericTest abcEqual = (n, m) -> (n < 0 ? -n : m) == (m < 0 ? -m : m);
        if (abcEqual.test(4,-4)){
            System.out.println("4 = |-4|");
        }
        if (!abcEqual.test(4,-5)){
            System.out.println("4 != |-5|");
        }
    }
}
