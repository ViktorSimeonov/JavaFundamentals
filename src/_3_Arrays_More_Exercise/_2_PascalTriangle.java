package _3_Arrays_More_Exercise;

import java.util.Scanner;

public class _2_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[0];
        for (int n = 1; n <= num; n++) {
            int[] arr1 = new int[n];
            for (int k = 0; k < n; k++) {
                if (k == 0 || k == n - 1) {
                    arr1[k] = 1;
                } else {
                    arr1[k] = arr2[k - 1] + arr2[k];
                }


//                System.out.printf("n:%d ", n);
//                System.out.printf("k:%d ", k);
//                for (int i = 0; i <; i++) {
//
                System.out.print(arr1[k] + " ");
//                }

            }
            arr2 = arr1;
            System.out.println();
        }

    }
}

