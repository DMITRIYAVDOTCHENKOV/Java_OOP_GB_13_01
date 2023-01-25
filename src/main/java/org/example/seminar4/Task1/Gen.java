package org.example.seminar4.Task1;

public class Gen<T> {

    /**
     * Обявляем объект типа Т
     */
    T ob;

    /**
     * передать конструктор объкета типа Т
     * 
     * @param o
     */
    Gen(T o) {
        ob = o;
    }

    /**
     * вернуть объкте ob из метода
     * 
     * @return
     */
    T getOb() {
        return ob;
    }

    /**
     * передать тип T
     */
    void showType() {
        System.out.println("Тип T это: " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob; // создаем ссылку на объект типа Integer
        iob = new Gen<Integer>(88); // создаем экземпляр типа Integer

        iob.showType(); // отобразить тип данных iob

        int v = iob.getOb(); // присвоить примитиву значение объкта iob
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> str = new Gen<String>("Тестируемое сообщение");
        str.showType(); // отобразить тип данных iob
        String str1 = str.getOb(); // присвоить примитиву значение объкта iob
        System.out.println("Значение: " + str1);

    }
}