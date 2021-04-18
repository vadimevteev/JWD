package by.javatr.tasks.task10.unit;

import java.util.HashMap;
import java.util.Map;

public class FunctionLogics {

    public static Map<Double, Double> FunctionValues(double a, double b, double h){

        h = Math.abs(h);
        if( b < a ){
            double x = b;
            b = a;
            a = x;
        }

        Map<Double, Double> function = new HashMap<>();
        while ( a<= b){
            double y = Math.tan(a);
            function.put(a,y);
            a += h;
        }
        return function;
    }
}
