package by.javatr.tasks.task10.unit;

import java.util.ArrayList;

public class FunctionLogics {

    public static StringBuilder createTable(double a, double b, double h){
        StringBuilder result = new StringBuilder("x\t\ty\n");
        if( b < a ){
            double x = b;
            b = a;
            a = x;
        }
        while ( a<= b){
            double y = Math.tan(a);
            result.append(String.format("%.3f", a))
                    .append("\t")
                    .append(String.format("%.3f", y))
                    .append("\n");
            a += h;
        }
        return result;
    }
}
