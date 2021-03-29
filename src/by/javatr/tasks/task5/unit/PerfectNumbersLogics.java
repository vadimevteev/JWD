package by.javatr.tasks.task5.unit;

public class PerfectNumbersLogics {
    public static boolean isPerfect(int number){
        boolean result = false;
        int sum =0;
        for(int i = 1;i < number;i++) {
            if(number % i == 0) sum+=i;
        }
        if(sum == number)
            result = true;
        return result;
    }
}
