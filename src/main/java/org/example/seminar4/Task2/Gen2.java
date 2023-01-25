package org.example.seminar4.Task2;

public class Gen2<T, V> {

    T ob1;
    V ob2;

    Gen2(T o1, V o2) {
        ob1 = o1;
        ob2 = ob2;
    }

    void showTypes() {
        System.out.println("Тип T это : " + ob1.getClass().getName());
        System.out.println("Тип V это : " + ob2.getClass().getName());

    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

class SimpGen {
    public static void main(String[] args) {
        Gen2<Integer, String> ob2;
        ob2 = new Gen2<Integer, String>(100, "Ob2 str");

        ob2.showTypes();

        int v = ob2.getOb1();
        System.out.println("Значение V " + v);

        String str = ob2.getOb2();
        System.out.println("Значение V " + str);
    }
}