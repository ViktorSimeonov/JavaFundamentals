package _8_MidExam;

import java.util.Scanner;

public class _2_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        String[] input = scanner.nextLine().split(" ");

        while (!"end".equals(input[0])) {

            switch (input[0]) {
                case "swap":
                    arr = swapArr(arr, input[1], input[2]);
                    break;
                case "multiply":
                    arr = multiplyArr(arr, input[1], input[2]);
                    break;
                case "decrease":
                    arr = decreaseArr(arr);
                    break;
            }

            input = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {

                System.out.print(arr[i] + ", ");
            }else {
                System.out.print(arr[i]);
            }
        }
    }

    private static int[] swapArr(int[] arr, String s, String s1) {
        int temp = arr[Integer.parseInt(s)];
        arr[Integer.parseInt(s)] = arr[Integer.parseInt(s1)];
        arr[Integer.parseInt(s1)] = temp;
        return arr;
    }

    private static int[] multiplyArr(int[] arr, String s, String s1) {
        arr[Integer.parseInt(s)] = (arr[Integer.parseInt(s)] * arr[Integer.parseInt(s1)]);
        return arr;
    }

    private static int[] decreaseArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] - 1);
        }
        return arr;
    }
}
