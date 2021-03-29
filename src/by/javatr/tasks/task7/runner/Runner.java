package by.javatr.tasks.task7.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task7.unit.Point;

public class Runner {

	public static void main(String... args){

		int x1,y1,x2,y2;

		System.out.print("Введите координату х точки А: ");
		x1 = DataScanner.enterIntFromConsole();

		System.out.print("Введите координату y точки А: ");
		y1 = DataScanner.enterIntFromConsole();

		System.out.print("Введите координату х точки B: ");
		x2 = DataScanner.enterIntFromConsole();

		System.out.print("Введите координату y точки B: ");
		y2 = DataScanner.enterIntFromConsole();

		Point a = new Point(x1,y1);
		Point b = new Point(x2,y2);

		int result = a.checkNearest(b);

		String message = "Точки равноудалены от центра";
		if(result > 0)
			message = "Точка А лежит ближе к центру";
		else if(result < 0)
			message = "Точка B лежит ближе к центру";

		System.out.println(message);

	}
}












