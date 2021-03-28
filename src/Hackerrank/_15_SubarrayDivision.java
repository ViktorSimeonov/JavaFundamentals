package Hackerrank;

import java.util.Scanner;

public class _15_SubarrayDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        String[] ronData = scanner.nextLine().split(" ");
        int ronBDay = Integer.parseInt(ronData[0]);
        int ronBMonth = Integer.parseInt(ronData[1]);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
            //System.out.print(arr[i] + " ");
        }
        int sum = 0;
        int result = 0;
        for (int i = 0; i <= arr.length-ronBMonth; i++) {
            for (int j = 0; j < ronBMonth; j++) {
                sum += arr[i+j];
            }
            if (sum == ronBDay) {
                result++;
            }
          sum=0;
        }
        System.out.println(result);
    }
}
