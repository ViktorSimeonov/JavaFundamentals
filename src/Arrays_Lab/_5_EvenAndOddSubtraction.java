package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _5_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int number : numbers) {
            if (number % 2 == 0){
                evenSum+=number;
            }else {
                oddSum+=number;
            }
        }
        int result = evenSum-oddSum;
        System.out.println(result);
    }
}
