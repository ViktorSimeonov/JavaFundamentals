package _3_Arrays_Exercise;


import java.util.Scanner;

public class _4_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        String first = "";
        for (int i = 0; i < n; i++) {
            first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
        System.out.println(String.join(" ", arr));
    }
}

