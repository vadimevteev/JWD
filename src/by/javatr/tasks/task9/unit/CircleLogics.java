package by.javatr.tasks.task9.unit;

public class CircleLogics {
    public static final double PI = Math.PI;
    public static double length(double radius){
        double result;
        result = 2 * PI * Math.abs(radius);
        return result;
    }

    public static double area(double radius){
        double result;
        result = PI * Math.pow(Math.abs(radius), 2);
        return result;
    }
}
