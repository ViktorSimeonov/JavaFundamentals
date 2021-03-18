package _5_ListExercise;

import java.util.Scanner;

public class _7_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrays = scanner.nextLine().split("\\|");
        String output = "";
        for (int i = arrays.length - 1; i >= 0; i--) {
            String[] arr = arrays[i].split("\\s+");
            for (int j = 0; j < arr.length; j++) {
               // String[] temp = arr[j].split("\\s+");
                if (!arr[j].equals("")) {
                    output += arr[j] + " ";
                }
            }
        }
        System.out.println(output);
    }
}
