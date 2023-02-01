package org.example.seminar5.Homeworks.PhoneBook.View;



import org.example.seminar5.Homeworks.PhoneBook.Person.Person;

import java.util.HashSet;
import java.util.Scanner;

public class View implements IView {


    @Override
    public void showContacts(HashSet<Person> listPersons) {
        if (listPersons.size() > 0) {
            System.out.println("\nList contacts:");
            System.out.printf("|%-8s|%-15s|\n", "PersonID", "Name");
            System.out.println("|========|===============|");
            for (Person p : listPersons) {
                System.out.printf("|%-8d|%-15s|\n", p.getIdPerson(), p.getName());
                System.out.println("|--------|---------------|");
            }
        } else {
            System.out.println("LIST EMPTY");
        }
    }

    public int choiceContacts(HashSet<Person> listPersons) {
        Scanner in = new Scanner(System.in);
        this.showContacts(listPersons);
        return in.nextInt();
    }

    @Override
    public void showPhoneList(Person p) {
        if (p != null && p.getPhoneList().size() > 0) {
            System.out.printf("|%-15s|%-15s|%-15s|\n", "Person", "Phone", "Comment");
            System.out.println("|===============|===============|===============|");
            for (var phone : p.getPhoneList().keySet()) {
                System.out.printf("|%-15s|%-15s|%-15s|\n", p.getName(), p.getPhoneList().get(phone), phone);
                System.out.println("|---------------|---------------|---------------|");
            }
        } else {
            System.out.println("СПИСОК ПУСТ ИЛИ НЕТ КОНТАКТА");
        }
    }

    @Override
    public int showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Главное меню, операция выбора:");
        System.out.println("\t1. Показать контакты");
        System.out.println("\t2. Показать контактные телефоны");
        System.out.println("\t3. Добавить контакт");
        System.out.println("\t4. Добавить телефон для контакта");
        System.out.println("\t5. Export base");
        System.out.println("\t6. Import base");
        System.out.println("\t0. Закрыть приложение");
        return in.nextInt();
    }

    @Override
    public String getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя контакт > ");
        return in.nextLine();
    }

    @Override
    public int getIndex() {
        Scanner in = new Scanner(System.in);
        System.out.print("индекс > ");
        return in.nextInt();
    }

    @Override
    public String getPhone() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите новый телефон > ");
        return in.nextLine();
    }

    @Override
    public String getComment() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите комментарий для телефона > ");
        return in.nextLine();
    }

    @Override
    public int choiceOperation() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите индекс человека > ");
        return in.nextInt();
    }
}
