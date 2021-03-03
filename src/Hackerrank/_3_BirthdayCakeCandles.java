package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _3_BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int maxHeight = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(numbers[i]>maxHeight){
                maxHeight=numbers[i];
                count=1;
            }else if(numbers[i]==maxHeight){
                count++;
            }
        }
        System.out.println(count);
    }
}
