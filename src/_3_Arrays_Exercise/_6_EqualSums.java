package _3_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftSum = 0;
        int rightSum = 0;
        boolean isEqual=false;
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int index = 0; index <= numbers.length - 1; index++) {
            int number = numbers[index];
            if (index == 0) {
                leftSum = 0;
            }
            if (index == numbers.length - 1) {
                rightSum = 0;
            }
            for (int i = index-1; i >= 0; i--) {

                leftSum += numbers[i];
            }
            for (int i = index+1; i <= numbers.length - 1; i++) {
                rightSum += numbers[i];
            }
            if(leftSum==rightSum){
                System.out.println(index);
                isEqual=true;
            }
            leftSum=0;
            rightSum=0;
        }
        if (!isEqual){
            System.out.println("no");
        }
    }
}
