package by.javatr.tasks.task6.unit;

import by.javatr.tasks.exception.DateTimeValuesException;

public class TimeLogic {

    public static final int DAY_SECONDS = 86400;
    public static final int HOUR_SECONDS = 3600;
    public static final int HOUR_MINUTES = 60;

    public static int hours(int seconds) throws DateTimeValuesException {
        if(seconds < 0 || seconds > DAY_SECONDS)
            throw new DateTimeValuesException("Incorrect seconds");

        int result = seconds / HOUR_SECONDS;
        return result;
    }

    public static int minutes(int seconds) throws DateTimeValuesException {
        if(seconds < 0 || seconds > DAY_SECONDS)
            throw new DateTimeValuesException("Incorrect seconds");

        int result = (seconds / HOUR_MINUTES) - hours(seconds) * HOUR_MINUTES;
        return result;
    }

    public static int seconds(int seconds) throws DateTimeValuesException {
        if(seconds < 0 || seconds > DAY_SECONDS)
            throw new DateTimeValuesException("Incorrect seconds");

        int result = seconds % HOUR_MINUTES;
        return result;
    }
}
