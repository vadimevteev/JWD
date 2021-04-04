package by.javatr.tasks.task3.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task3.unit.AreaLogics;

public class Runner {

	public static void main(String... args){

		double a;
		System.out.print("Введите площадь описанного квадрата: ");
		a = DataScanner.enterDoubleFromConsole();

		double area = AreaLogics.findInscribedArea(a);
		int quotient = (int)(a / area);
		String result = String.format("%.3f",area);

		System.out.println("Площадь вписанного квадрата: " + result
				+ "\nПлощадь вписанного квадрата в окружность меньше площади описанного в " + quotient + " раз");
	}
}












