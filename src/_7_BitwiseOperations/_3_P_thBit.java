package _7_BitwiseOperations;

import java.util.Scanner;

public class _3_P_thBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if(num==0||num==1){
            System.out.println("Number out of exception");
            return;
        }
        int bitNum=Integer.parseInt(scanner.nextLine());

        System.out.println(toBinary(num,bitNum));
    }

    static String toBinary(int num,int bitNum) {
        String result = "";
        while (num > 0) {
            int digit = num % 2;
            result = digit + result;
            num = num / 2;
        }
        System.out.printf("Length of String is: %d%n",result.length());
        for (int i = result.length(); i < 16; i++) {
            result ="0"+result;
        }
        System.out.println(result);
        char bitOnPositionTwo = result.charAt(result.length() - 1-bitNum );

        return "" + bitOnPositionTwo;
    }

}
