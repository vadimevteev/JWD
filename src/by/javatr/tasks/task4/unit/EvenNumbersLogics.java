package by.javatr.tasks.task4.unit;

import by.javatr.tasks.exception.NullArrayException;

public class EvenNumbersLogics {
    public static int MIN_EVENS = 2;
    public static boolean isConsistTwoEvenNumbers(int[] numbers) throws NullArrayException {

        if(numbers == null)
            throw new NullArrayException("Array is null!");

        int evenNums = 0;
        boolean result = false;

        for (int number : numbers)
            if(number % 2 == 0)
                evenNums++;

        if(evenNums >= MIN_EVENS)
            result = true;

        return result;
    }
}
