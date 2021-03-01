package _3_Arrays_More_Exercise;

import java.util.Scanner;

public class _3_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 1 && num <= 50) {
            long[] arr = new long[num];
//        arr[0]=1;
//       // System.out.print(arr[0]+" ");
//        arr[1]=1;
//        //System.out.print(arr[1]+
            for (int i = 0; i <= arr.length - 1; i++) {
                if (i == 0 || i == 1) {
                    arr[i] = 1;
                } else {

                    arr[i] = arr[i - 1] + arr[i - 2];
                }
                // System.out.print(arr[i]+" ");

            }
            System.out.println(arr[arr.length - 1]);
        }else {
            System.out.println(num);
        }
    }
}
