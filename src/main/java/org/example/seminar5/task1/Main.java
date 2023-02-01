package org.example.seminar5.task1;


import org.example.seminar5.task1.Console.View;
import org.example.seminar5.task1.Presenter.Presenter;
import org.example.seminar5.task1.Model.*;

public class Main {
    public static void main(String[] args) {
        Presenter app = new Presenter(new SumCalc(), new View());
        app.runOperation();
    }
}
