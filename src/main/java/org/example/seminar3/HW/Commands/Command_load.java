package org.example.seminar3.HW.Commands;

import org.example.seminar3.HW.FamilyTreeUtils;
import org.example.seminar3.HW.Interfaces.ICommand;

import java.util.Scanner;

public class Command_load implements ICommand {

    @Override
    public String info() {
        return "load - загрузка дерева из файла";
    }

    @Override
    public String getName() {
        return "load";
    }

    @Override
    public void exercute(Scanner scanner, FamilyTreeUtils utils) {
        utils.geFamilyTree().load("FamilyTree.dat");
    }

}
