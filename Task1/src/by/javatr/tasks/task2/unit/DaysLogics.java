package by.javatr.tasks.task2.unit;


import by.javatr.tasks.exception.BadDateValuesException;

public class DaysLogics {
    public final static int PROBABLY_LEAP = 4;
    public final static int NOT_LEAP = 100;
    public final static int ALWAYS_LEAP = 400;
    public static int amountOfDays(int year, int month) throws BadDateValuesException {
        if (month < 0 || month > 12 || year < 0)
            throw new BadDateValuesException("The year or the month is not valid!");

        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            default:
                days = isLeap(year) ? 29 : 28;
        }
        return days;
    }

    public static boolean isLeap(int year) {
        boolean leap = false;
        if (year % PROBABLY_LEAP == 0 && (year % NOT_LEAP != 0 || year % ALWAYS_LEAP == 0))
            leap = true;
        return leap;
    }
}

