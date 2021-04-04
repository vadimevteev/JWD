package by.javatr.tasks.task4.unit;

public class EvenNumbersLogics {
    public static int MIN_EVENS = 2;
    public static boolean isConsistTwoEvenNumbers(int... numbers){
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
