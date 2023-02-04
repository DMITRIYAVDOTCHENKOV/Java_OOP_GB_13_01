package org.example.seminar5.Homeworks.PhoneBook.View;


import org.example.seminar5.Homeworks.PhoneBook.Person.Person;

import java.util.HashSet;

public interface IView {
    void showContacts(HashSet<Person> listPersons);
    int choiceContacts(HashSet<Person> listPersons);
    void showPhoneList(Person person);

    String getName();
    int getIndex();
    String getPhone();
    String getComment();
    int choiceOperation();
}