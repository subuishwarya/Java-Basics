package basic_lvl;
import java.util.ArrayList;
import java.util.List;

public class perfectNumber {
    public static void main(String[] args) {
        int startRange = 1;
        int endRange = 10000;

        List<Integer> perfectNumbers = findPerfectNumbers(startRange, endRange);
        System.out.println("Perfect numbers within the range " + startRange + " to " + endRange + ":");
        for (int num : perfectNumbers) {
            System.out.println(num);
        }
    }

    public static List<Integer> findPerfectNumbers(int start, int end) {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPerfectNumber(num)) {
                perfectNumbers.add(num);
            }
        }
        return perfectNumbers;
    }

    public static boolean isPerfectNumber(int num) {
        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        return num == sumOfDivisors;
    }
}
