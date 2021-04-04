package by.javatr.tasks.task7.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task7.entity.Point;
import by.javatr.tasks.task7.unit.PointLogics;

public class Runner {

	public static void main(String... args){

		double x1,y1,x2,y2;

		System.out.print("Введите координату х точки А: ");
		x1 = DataScanner.enterDoubleFromConsole();

		System.out.print("Введите координату y точки А: ");
		y1 = DataScanner.enterDoubleFromConsole();

		System.out.print("Введите координату х точки B: ");
		x2 = DataScanner.enterDoubleFromConsole();

		System.out.print("Введите координату y точки B: ");
		y2 = DataScanner.enterDoubleFromConsole();

		Point a = new Point(x1,y1);
		Point b = new Point(x2,y2);

		int result = PointLogics.checkNearest(a,b);
		String message = PointLogics.findMessage(result);

		System.out.println(message);

	}
}












