package by.javatr.tasks.task4.runner;

import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task4.unit.EvenNumbersLogics;


public class Runner {

	public static void main(String... args){
		final int SIZE = 4;
		int[] numbers = new int[SIZE];
		for (int i = 0;i<numbers.length;i++) {
			System.out.print("Введите число: ");
			numbers[i] = DataScanner.enterIntFromConsole();
		}

		boolean result = EvenNumbersLogics.isConsistTwoEvenNumbers(numbers);
		System.out.print(result);
	}
}












