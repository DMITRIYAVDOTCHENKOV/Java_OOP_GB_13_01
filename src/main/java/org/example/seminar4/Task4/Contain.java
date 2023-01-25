package org.example.seminar4.Task4;

public interface Contain<T> {

    boolean contains(T o);
}

class Gen4<T> implements Contain<T> {
    /**
     * Если интурфейс обобщен, то класс, реализующий его, долен быть обожен.
     */
    T[] arr;

    Gen4(T[] o) {
        arr = o;
    }

    /**
     * реализован метод интерфейса для проверки вхождения в массив(есть ли такой
     * элемент в массиве)
     */
    @Override
    public boolean contains(T o) {
        for (T x : arr) {
            if (x.equals(o)) {
                return true;
            }
        }
        return false;
    }
}

class Gen5 {
    public static void main(String[] args) {
        Integer[] x = { 1, 2, 3, 4 };

        Gen4<Integer> ob = new Gen4<>(x);

        if (ob.contains(2)) {
            System.out.println("2 содержится в ob");
        } else {
            System.out.println("2 Не содержится в ob");
        }

        if (ob.contains(5)) {
            System.out.println("5 содержится в ob");
        } else {
            System.out.println("5 Не содержится в ob");
        }
    }
}