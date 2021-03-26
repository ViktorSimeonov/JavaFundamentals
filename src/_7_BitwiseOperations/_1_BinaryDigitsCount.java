package _7_BitwiseOperations;

import java.util.Scanner;

public class _1_BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int binaryDigit = Integer.parseInt(scanner.nextLine());
        int countZeros=0;
        int countOnes=0;
        while (num > 0) {
            int digit = num % 2;
            if(digit==0){
                countZeros++;
            }else {
                countOnes++;
            }
            num = num / 2;
        }
        if(binaryDigit==1){
            System.out.println(countOnes);
        }else if (binaryDigit==0){
            System.out.println(countZeros);
        }
    }
}
