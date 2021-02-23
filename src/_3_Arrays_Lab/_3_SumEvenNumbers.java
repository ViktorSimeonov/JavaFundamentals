package _3_Arrays_Lab;

import java.util.Scanner;

public class _3_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] splitedArr = numbers.split(" ");
        int[] arr = new int[splitedArr.length];
        int sum=0;
        for (int i = 0; i < splitedArr.length; i++) {
            arr[i] = Integer.parseInt(splitedArr[i]);
            if (arr[i] % 2 == 0){
                sum+=arr[i];
            }
        }
        System.out.print(sum);
    }
}
