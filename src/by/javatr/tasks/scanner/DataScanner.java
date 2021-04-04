package by.javatr.tasks.scanner;

import java.util.Scanner;

public class DataScanner {
	
	@SuppressWarnings("resource")
	public static int enterIntFromConsole(){
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		while(!sc.hasNextInt()) {
			sc.next();
		}
		
		a=sc.nextInt();
		
		return a;
	}

	public static double enterDoubleFromConsole(){

		Scanner sc = new Scanner(System.in);

		double a = 0;

		while(!sc.hasNextDouble()) {
			sc.next();
		}

		a=sc.nextDouble();

		return a;
	}
}





