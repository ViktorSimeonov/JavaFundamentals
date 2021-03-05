package _4_Methods_Exercise;

import java.util.Scanner;

public class _1_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
       printTheSmallestNumber(firstNum, secondNum, thirdNum);
    }

    private static void printTheSmallestNumber(int firstNum, int secondNum, int thirdNum) {
        if (firstNum <= secondNum && firstNum <= thirdNum){
            System.out.println(firstNum);
        }else if(secondNum<=firstNum&&secondNum<=thirdNum){
            System.out.println(secondNum);
        }else {
            System.out.println(thirdNum);
        }
    }
}

