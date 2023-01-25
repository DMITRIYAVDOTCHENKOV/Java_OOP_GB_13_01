package org.example.seminar3.HW.Commands;

import org.example.seminar3.HW.FamilyTreeUtils;
import org.example.seminar3.HW.Interfaces.ICommand;

import java.util.Scanner;


public class Command_save implements ICommand {

    @Override
    public String info() {
        return "save - сохранение в файл";
    }

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public void exercute(Scanner scanner, FamilyTreeUtils utils) {
        utils.geFamilyTree().save("FamilyTree.dat");
    }

}
