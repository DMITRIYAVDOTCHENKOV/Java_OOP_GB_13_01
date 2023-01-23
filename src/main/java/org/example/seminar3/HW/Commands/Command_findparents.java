package org.example.seminar3.HW.Commands;

import org.example.seminar3.HW.FamilyTreeUtils;
import org.example.seminar3.HW.Interfaces.ICommand;
import org.example.seminar3.HW.Person;

import java.util.List;
import java.util.Scanner;


public class Command_findparents<T> implements ICommand {

    @Override
    public String info() {
        return "findparents - нахождение родителей персоны с ID";
    }

    @Override
    public String getName() {
        return "findparents";
    }

    @Override
    public void exercute(Scanner scanner, FamilyTreeUtils utils) {
        System.out.println("Введите ID: ");
        String input = scanner.nextLine();
        List parents = utils.FindParents(Integer.parseInt(input));
        for (Object person : parents) {
            System.out.println(person);
        }

    }

}
