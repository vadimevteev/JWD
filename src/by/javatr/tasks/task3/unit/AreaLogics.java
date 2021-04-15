package by.javatr.tasks.task3.unit;

public class AreaLogics {
    public final static double COEFFICIENT = Math.sqrt(2);

    public static double findInscribedArea(double area){
        double diameterInscribed = Math.sqrt(Math.abs(area));
        double sideInscribed = diameterInscribed / COEFFICIENT;
        double areaInscribed = Math.pow(sideInscribed,2);
        return areaInscribed;
    }

    public static int findCoefficient(double areaInscribed, double areaCircumscribed){
        int quotient = (int)(areaCircumscribed / areaInscribed);
        return quotient;
    }
}

