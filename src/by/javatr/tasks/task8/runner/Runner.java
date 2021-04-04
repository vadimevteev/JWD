package by.javatr.tasks.task8.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task8.unit.FunctionLogics;

public class Runner {

    public static void main(String... args){
        double x;
        System.out.print("Введите x: ");
        x = DataScanner.enterDoubleFromConsole();

        double y = FunctionLogics.function(x);
        String result = String.format("%.6f",y);
        System.out.println("F(x) = " + result);
    }
}
