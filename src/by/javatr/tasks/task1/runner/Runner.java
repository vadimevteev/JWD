package by.javatr.tasks.task1.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task1.unit.SquareLogics;

public class Runner {

	public static void main(String... args) {
		
		int a;
		System.out.print("Введите последнюю цифру числа: ");
		a = DataScanner.enterIntFromConsole();

		int result = SquareLogics.findLastDigitSquare(a);
		System.out.println("Последняя цифра квадрата числа: " + result);
	}
}












