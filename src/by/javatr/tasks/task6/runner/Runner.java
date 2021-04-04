package by.javatr.tasks.task6.runner;

import by.javatr.tasks.exception.DateTimeValuesException;
import by.javatr.tasks.scanner.DataScanner;
import by.javatr.tasks.task6.unit.TimeLogic;

public class Runner {

	public static void main(String... args){
		int a;
		System.out.print("Введите количество секунд: ");
		a = DataScanner.enterIntFromConsole();
		try {
			int hours = TimeLogic.hours(a);
			int minutes = TimeLogic.minutes(a);
			int seconds = TimeLogic.seconds(a);
			System.out.print("Прошло " + hours + " часов(а), " + minutes + " минут(ы), " + seconds + " секунд(ы)");
		}
		catch (DateTimeValuesException e){
			System.err.println(e.getMessage());
		}
	}
}












