package _3_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _8_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int givenNumber = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int num = numbers[index];
            for (int i = index; i <= numbers.length-1; i++) {
                if(index==i){
                    continue;
                }
                sum = num+numbers[i];
                if(sum==givenNumber){
                    System.out.printf("%d %d",num,numbers[i]);
                    System.out.println();
                }
            }
        }
    }
}
