package org.example.seminar3.HW.Commands;

import org.example.seminar3.HW.FamilyTreeUtils;
import org.example.seminar3.HW.Interfaces.ICommand;

import java.util.Scanner;


public class Command_print implements ICommand {

    @Override
    public String info() {
        return "print - вывод дерева";
    }

    @Override
    public String getName() {
        return "print";
    }

    @Override
    public void exercute(Scanner scanner, FamilyTreeUtils utils) {
        utils.print();
    }
}