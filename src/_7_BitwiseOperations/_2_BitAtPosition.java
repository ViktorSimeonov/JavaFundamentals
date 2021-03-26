package _7_BitwiseOperations;

import java.util.Scanner;

public class _2_BitAtPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if(num==0||num==1){
            System.out.println("Number out of exception");
            return;
        }

        System.out.println(toBinary(num));
    }

    static String toBinary(int num) {
        String result = "";
        while (num > 0) {
            int digit = num % 2;
            result = digit + result;
            num = num / 2;
        }
        System.out.println(result);
        char bitOnPositionTwo = result.charAt(result.length() - 2);

        return "" + bitOnPositionTwo;
    }

}
