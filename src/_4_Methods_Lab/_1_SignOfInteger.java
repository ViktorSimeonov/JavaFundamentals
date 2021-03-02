package _4_Methods_Lab;

import java.util.Scanner;

public class _1_SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printSign(number);

    }

    private static void printSign(int number) {
        if(number<0){
            System.out.printf("The number %d is negative.",number);
        } else if (number>0){
            System.out.printf("The number %d is positive.",number);
        }else {
            System.out.printf("The number %d is zero.",number);
        }

    }
}
    
