package _3_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _7_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int equalsNum = 0;
        int startIndex = 0;
        int count ;
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int index = 0; index <= numbers.length - 1; index++) {
            int number = numbers[index];
            count = 0;
            for (int i = 0; i <= numbers.length - 1; i++) {
                if (number == numbers[i]) {
                    count++;
                    if (count > equalsNum) {
                        equalsNum = count;
                        startIndex = ((i+1) - equalsNum);
                    }
                } else {
                    count = 0;
                }
            }
        }
        for (int i = startIndex; i < (startIndex+equalsNum); i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
