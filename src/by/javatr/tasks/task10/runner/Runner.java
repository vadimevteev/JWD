package by.javatr.tasks.task10.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task10.unit.FunctionLogics;

public class Runner {

    public static void main(String... args){

        double a,b,h;
        System.out.print("Введите нижнюю границу икса: ");
        a = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите верхнюю границу икса: ");
        b = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите шаг: ");
        h = DataScanner.enterDoubleFromConsole();

        String result = String.valueOf(FunctionLogics.createTable(a,b,h));

        System.out.println(result);
    }
}
