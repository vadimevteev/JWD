package by.javatr.tasks.task10.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task10.unit.FunctionLogics;

import java.util.*;

public class Runner {

    public static void main(String... args){

        double a,b,h;
        System.out.print("Введите нижнюю границу икса: ");
        a = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите верхнюю границу икса: ");
        b = DataScanner.enterDoubleFromConsole();

        System.out.print("Введите шаг: ");
        h = DataScanner.enterDoubleFromConsole();

        Map<Double, Double> function = FunctionLogics.FunctionValues(a,b,h);
        String result = String.valueOf(createTable(function));

        System.out.println(result);
    }

    public static StringBuilder createTable(Map<Double, Double> function){

        StringBuilder table = new StringBuilder("x\t\ty\n");
        List<Double> keys = new ArrayList<>(function.keySet());
        Collections.sort(keys);
        for(double key : keys){
            table.append(String.format("%.3f", key))
                    .append("\t")
                    .append(String.format("%.3f", function.get(key)))
                    .append("\n");
        }
        return table;
    }
}
