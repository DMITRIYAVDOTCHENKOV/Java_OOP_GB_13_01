package org.example.seminar4.Task5;

public class Gen5 {
    private int sum;

    <R extends Number> Gen5(R arg) {
        sum = 0;
        for (int i = 0; i < arg.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}

class Get5Demo {
    public static void main(String[] args) {
        Gen5 ob = new Gen5(10.0);
        System.out.println("Сумма целых чисел от 0 до 4 = " + ob.getSum());
    }
}