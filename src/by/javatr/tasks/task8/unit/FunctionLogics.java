package by.javatr.tasks.task8.unit;

public class FunctionLogics {
    public static final int LIMIT = 3;
    public static double function(double x){
        double result;
        if(x >= LIMIT)
            result = -(Math.pow(x,2)) + 3 * x + 9;
        else
            result = 1 / (Math.pow(x,3) - 6);
        return result;
    }
}
