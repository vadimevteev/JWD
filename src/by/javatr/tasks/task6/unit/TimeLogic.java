package by.javatr.tasks.task6.unit;

import by.javatr.tasks.exception.BadDateValuesException;

public class TimeLogic {

    public static final int DAY_SECONDS = 86400;
    public static final int HOUR_SECONDS = 3600;
    public static final int HOUR_MINUTES = 60;

    public static int hours(int seconds) throws BadDateValuesException {
        if(seconds < 0 || seconds > DAY_SECONDS)
            throw new BadDateValuesException("Incorrect seconds");

        int result = seconds / HOUR_SECONDS;
        return result;
    }

    public static int minutes(int seconds) throws BadDateValuesException {
        if(seconds < 0 || seconds > DAY_SECONDS)
            throw new BadDateValuesException("Incorrect seconds");

        int result = (seconds / HOUR_MINUTES) - hours(seconds) * HOUR_MINUTES;
        return result;
    }

    public static int seconds(int seconds) throws BadDateValuesException {
        if(seconds < 0 || seconds > DAY_SECONDS)
            throw new BadDateValuesException("Incorrect seconds");

        int result = seconds % HOUR_MINUTES;
        return result;
    }
}
