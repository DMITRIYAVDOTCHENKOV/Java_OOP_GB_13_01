package org.example.seminar4.HW4.planer;

import java.util.Scanner;

public class Controller {
    public static void run(){
        Task t1 = new Task("Выучить Java", "Дмитрий", 2, "01.12.24");
        Task t3 = new Task("Сходить в кино", "Дмитрий", 2, "30.6.23");
        Task t4 = new Task("Купить пивка", "Дмитрий", 1, "30.02.23");
        Task t5 = new Task("Погулять с ребенком", "Дмитрий", 3, "30.01.23");
        Planner myP = new Planner();
        myP.add(t1);
        myP.add(t3);
        myP.add(t4);
        myP.add(t5);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        Add add = new Add(scanner);
        UserInterface userInterface = new UserInterface(scanner, menu, myP, add);
        userInterface.start();
    }
}
