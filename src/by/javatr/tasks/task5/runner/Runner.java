package by.javatr.tasks.task5.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task5.unit.PerfectNumbersLogics;


public class Runner {

	public static void main(String... args){
		int a;
		System.out.print("Введите число: ");
		a = DataScanner.enterIntFromConsole();

		boolean result = PerfectNumbersLogics.isPerfect(a);
		System.out.print(result);
	}
}












