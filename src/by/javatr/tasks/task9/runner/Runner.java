package by.javatr.tasks.task9.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task9.unit.CircleLogics;

public class Runner {

    public static void main(String... args){
        double r;
        System.out.print("Введите радиус: ");
        r = DataScanner.enterDoubleFromConsole();

        double length = CircleLogics.length(r);
        String resultLength = String.format("%.3f",length);

        double area = CircleLogics.area(r);
        String resultArea = String.format("%.3f",area);

        System.out.println("Длина окружности:" + resultLength +
                "\nПлощадь: " + resultArea);
    }
}
