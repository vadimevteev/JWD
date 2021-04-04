package by.javatr.tasks.task7.unit;

import by.javatr.tasks.task7.entity.Point;

public class PointLogics {
    public static int checkNearest(Point a, Point b){
        int result = 0;
        double lengthFirstSquared = (Math.pow(a.getX(),2) + Math.pow(a.getY(),2));
        double lengthSecondSquared = (Math.pow(b.getX(),2) + Math.pow(b.getY(),2));
        if(lengthFirstSquared > lengthSecondSquared)
            result = -1;
        else if(lengthFirstSquared < lengthSecondSquared)
            result = 1;
        return result;
    }

    public static String findMessage(int result){
        String message = "Точки равноудалены от центра";
        if(result > 0)
            message = "Точка А лежит ближе к центру";
        else if(result < 0)
            message = "Точка B лежит ближе к центру";
        return message;
    }
}
