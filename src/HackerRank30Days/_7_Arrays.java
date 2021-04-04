package HackerRank30Days;

import java.util.Scanner;

public class _7_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}
