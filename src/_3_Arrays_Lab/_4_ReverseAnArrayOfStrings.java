package _3_Arrays_Lab;


import java.util.Scanner;

public class _4_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        for (int i = 0; i < arr.length /2; i++) {
            String zeroIndex = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=zeroIndex;
        }
        // Arrays.stream(arr).forEach(System.out::println);
       // System.out.println(String.join(" ",arr)); // друг начин за принт
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
//        for (String s : arr) {
//
//        }
//        for (String s : arr) {
//        System.out.println(s);
//    }
    }
}
