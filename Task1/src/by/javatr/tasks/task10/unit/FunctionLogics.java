package by.javatr.tasks.task10.unit;

public class FunctionLogics {

    public static double functionValue(double x){
        return Math.tan(x);
    }

    public static StringBuilder createTable(double a, double b, double h){
        StringBuilder result = new StringBuilder("x\t\ty\n");
        if( b < a){
            double x = b;
            b = a;
            a = x;
        }
        while ( a<= b){
            double y = functionValue(a);
            result.append(String.format("%.3f", a))
                    .append("\t")
                    .append(String.format("%.3f", y))
                    .append("\n");
            a += h;
        }
        return result;
    }
}
