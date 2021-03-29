package by.javatr.tasks.task2.runner;

import by.javatr.tasks.exception.BadDateValuesException;
import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task2.unit.DaysLogics;

public class Runner {

	public static void main(String... args){
		
		int year, month;
		System.out.print("Введите год: ");
		year = DataScanner.enterIntFromConsole();

		System.out.print("Введите месяц: ");
		month = DataScanner.enterIntFromConsole();
		try {
			int days = DaysLogics.amountOfDays(year,month);
			System.out.println("Количество дней в данной месяце: " + days);
		}
		catch (BadDateValuesException e){
			System.err.println(e.getMessage());
		}
	}
}












