package _3_Arrays_Exercise;

import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] redArr = new String[n];
        String[] blackArr = new String[n];
        for (int i = 0; i < n; i++) {
            String numbers = scanner.nextLine();
            String[] arr = numbers.split(" ");
            for (int j = 0; j < arr.length; j++) {

                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        redArr[i] = arr[j];
                    } else {
                        blackArr[i] = arr[j];
                    }
                } else {
                    if (j % 2 == 0) {
                        blackArr[i] = arr[j];
                    } else {
                        redArr[i] = arr[j];
                    }
                }
            }
        }// или може и така но само при масиви от тип Стринг
        //System.out.println(String.join(" ",redArr));
        for (String red : redArr) {
            System.out.print(red+" ");
        }
        // или може и така но само при масиви от тип Стринг
        //System.out.println(String.join(" ",blackArr));
        System.out.println();
        for (String black : blackArr) {
            System.out.print(black+" ");
        }
    }
}
