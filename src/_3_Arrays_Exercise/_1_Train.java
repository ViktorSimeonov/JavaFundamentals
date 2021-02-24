package _3_Arrays_Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int index = 0; index < n; index++) {
            numbers[index] = Integer.parseInt(scanner.nextLine());
        }
        int sum= 0;
        for (int number : numbers) {
            System.out.print(number+" ");
            sum+=number;
        }
        System.out.println();
        System.out.println(sum);
        //реда от долу ползва Stream
        System.out.println(Arrays.stream(numbers).sum());
        //реда от долу ползва Stream
        System.out.println(Arrays.stream(numbers).max());
        //реда от долу ползва Stream
        System.out.println(Arrays.stream(numbers).min());
//        //Стандартно решение със стари знания :)
//        int n = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            int number = Integer.parseInt(scanner.nextLine());
//            System.out.print(number+" ");
//            sum+=number;
//
//        }
//        System.out.println();
//        System.out.println(sum);
    }
}
