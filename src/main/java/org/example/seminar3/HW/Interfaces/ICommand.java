package org.example.seminar3.HW.Interfaces;

import org.example.seminar3.HW.FamilyTreeUtils;

import java.util.Scanner;


public interface ICommand  {

    String info();


    String getName();


    void exercute(Scanner scanner, FamilyTreeUtils utils);
}
