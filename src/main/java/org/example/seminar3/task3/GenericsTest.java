package org.example.seminar3.task3;

public class GenericsTest {
    public static void main(String[] args) {


        SomeTest<Integer> someTest = ((n, m) -> (n % m) == 0);

        if (someTest.someTest(10, 2)) {
            System.out.println("2 это делитель 10");
        }
        if (someTest.someTest(10, 3)) {
            System.out.println("3 не делитель 10");
        }
        System.out.println(" ");


        SomeTest<Double> someTest1 = ((n, m) -> (n % m) == 0);

        if (someTest1.someTest(10.0, 2.0)) {
            System.out.println("2.0 это делитель 10.0");
        }
        if (someTest1.someTest(10.0, 3.0)) {
            System.out.println("3.0 не делитель 10.0");
        }
        System.out.println(" ");

        SomeTest<String> stringSomeTest = (String::contains);
//        SomeTest<String> stringSomeTest = ((n, m) -> n.contains(m));
//        SomeTest<String> stringSomeTest = ((n, m) -> n.indexOf(m) != -1);
        String str = "Обобщенный функциональный  интерфейс";
        System.out.println("Test string " + str);
        if (stringSomeTest.someTest(str, "Другое слово")) {
            System.out.println("Слово найдено");
        } else {
            System.out.println("Не найдено");
        }
    }
}
