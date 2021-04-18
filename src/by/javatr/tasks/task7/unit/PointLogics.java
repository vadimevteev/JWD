package by.javatr.tasks.task7.unit;

import by.javatr.tasks.task7.entity.Point;

public class PointLogics {
    public static int checkNearest(Point a, Point b){
        if(a == null || b == null){
            //Exception
        }

        int result = 0;
        double lengthFirstSquared = (Math.pow(a.getX(),2) + Math.pow(a.getY(),2));
        double lengthSecondSquared = (Math.pow(b.getX(),2) + Math.pow(b.getY(),2));

        if(lengthFirstSquared > lengthSecondSquared)
            result = -1;
        else if(lengthFirstSquared < lengthSecondSquared)
            result = 1;

        return result;
    }
}
