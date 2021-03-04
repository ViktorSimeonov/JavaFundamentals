package _4_Methods_Lab;

import java.util.Scanner;

public class _9_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case"string":
                String  firstString = scanner.nextLine();
                String  secondString = scanner.nextLine();
                System.out.println(getMax(firstString,secondString));
                break;
        }

    }

    private static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return (firstNum);
        } else {
            return (secondNum);
        }
    }

    private static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return (firstChar);
        } else {
            return (secondChar);
        }
    }
    static String getMax(String firstString,String secondString){
        if(firstString.compareTo(secondString)>=0){
            return (firstString);
        }else {
            return (secondString);
        }
    }

}
