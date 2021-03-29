package by.javatr.tasks.task7.unit;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int checkNearest(Point b){
        int result = 0;
        int lengthFirstSquared = this.x * this.x + this.y * this.y;
        int lengthSecondSquared = b.x * b.x + b.y * b.y;
        if(lengthFirstSquared > lengthSecondSquared)
            result = -1;
        else if(lengthFirstSquared < lengthSecondSquared)
            result = 1;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " {x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
