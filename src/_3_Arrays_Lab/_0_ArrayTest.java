package _3_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _0_ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int []numbers = new int[3];
//        numbers[0]=27;
//        numbers[1]=13;
//        numbers[2]=numbers[0]+numbers[1];
//        int n = Integer.parseInt(scanner.nextLine());
//        String name = "Pesho";
//        int lenghtString = name.length();
//        System.out.println(lenghtString);
//        int[] numbers = new int[10];
//        int lengthArray = numbers.length;
//        System.out.println(lengthArray);
//        String[] names = new String[n];
//        names[0] = scanner.nextLine();
//        System.out.println(names[0]);
//        int n = Integer.parseInt(scanner.nextLine());
//        String[] names = new String[n];
//
//        for (int i = 0; i < names.length; i++) {
//            names[i]=scanner.nextLine();
//        }
//        String[] arr = {"one", "two"};
//// == new String [] {"one", "two"};
//// Process all array elements
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("arr[%d] = %s%n", i, arr[i]);
//        }
        //how to read String and split it to numbers !!
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int number : numbers) {
            System.out.println(number);
        }
        // това е същото създаване на горния масив но по подробно :
//        String values = sc.nextLine();
//        String[] items = values.split(" ");
//        int[] arr = new int[items.length];
//
//        for (int i = 0; i < items.length; i++)
//            arr[i] = Integer.parseInt(items[i]);

    }
}
