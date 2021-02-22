package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _7_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int j = 0; j < arr.length - 1; j++) {
            int[] condensedArr = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                condensedArr[i] = arr[i] + arr[i + 1];
                arr[i] = condensedArr[i];
            }

//            for (int i : condensedArr) {
//                System.out.printf(i + " ");
//            }
        }
        System.out.println(arr[0]);
    }
}
