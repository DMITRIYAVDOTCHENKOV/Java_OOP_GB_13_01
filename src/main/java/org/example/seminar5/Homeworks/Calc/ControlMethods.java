package org.example.seminar5.Homeworks.Calc;


import org.example.seminar5.Homeworks.Calc.TypeData.Complex;
import org.example.seminar5.Homeworks.Calc.TypeData.IMainOperation;
import org.example.seminar5.Homeworks.Calc.TypeData.Rational;
import org.example.seminar5.Homeworks.Calc.View.View;

public class ControlMethods<T> {
    IMainOperation num1;
    IMainOperation num2;
    boolean status = true;
    boolean getAns = true;
    View view = new View();

    public void runOperation() {
        while (getAns) {
            int choice = view.choiceTypeValues();
            switch (choice) {
                case 1 -> {
                    num1 = new Rational("Первое");
                    num2 = new Rational("Второе");
                }
                case 2 -> {
                    num1 = new Complex("первое число");
                    num2 = new Complex("Второе число");
                }
                case 3 -> this.status = false;
                default -> this.getAns = false;
            }
            if (!this.status) break;
            if (!this.getAns) {
                this.getAns = true;
                continue;
            }
            choice = view.choiceOperation();
            switch (choice) {
                case 1 -> num1.summarize(num2);
                case 2 -> num1.subtraction(num2);
                case 3 -> num1.multiplication(num2);
                case 4 -> num1.division(num2);
                case 5 -> this.getAns = false;
            }
            if (!this.getAns) {
                this.getAns = true;
                continue;
            } else {
                view.showResult(num1.toString());
            }

        }
    }
}
