package by.javatr.tasks.task3.unit;

public class AreaLogics {
    public final static double COEFFICIENT = Math.sqrt(2);

    public static double inscribedArea(double area){
        double diameterInscribed = Math.sqrt(area);
        double sideInscribed = diameterInscribed / COEFFICIENT;
        double areaInscribed = Math.pow(sideInscribed,2);
        return areaInscribed;
    }
}

