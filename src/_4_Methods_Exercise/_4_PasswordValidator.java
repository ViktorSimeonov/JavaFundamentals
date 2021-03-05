package _4_Methods_Exercise;

import java.util.Scanner;

public class _4_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        passwordValidator(password);
    }

    private static void passwordValidator(String password) {
        boolean between = betweenChar(password);
        boolean letDig = letterAndDigits(password);
        boolean twoDig = atLeastTwoDigits(password);
        if (between && letDig & twoDig) {
            System.out.println("Password is valid");
        }
    }

    private static boolean betweenChar(String password) {
        boolean between6and10;
        if (!(password.length() >= 6 && password.length() <= 10)) {
            System.out.println("Password must be between 6 and 10 characters");
            between6and10 = false;
        } else {
            between6and10 = true;
        }
        return (between6and10);
    }

    private static boolean letterAndDigits(String password) {
        boolean letAndDig = false;
        for (int i = 0; i < password.length(); i++) {
            int currentChar = password.charAt(i);
            if (!(currentChar >= 48 && currentChar <= 57 || currentChar >= 65 && currentChar <= 90
                    || currentChar >= 97 && currentChar <= 122)) {
                System.out.println("Password must consist only of letters and digits");
                letAndDig = false;
                break;
            } else {
                letAndDig = true;
            }
        }
        return (letAndDig);

    }

    private static boolean atLeastTwoDigits(String password) {
        boolean twoDig;
        int countDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            int currentChar = password.charAt(i);
            if (currentChar >= 48 && currentChar <= 57) {
                countDigits++;
            }
        }
        if (countDigits < 2) {
            System.out.println("Password must have at least 2 digits");
            twoDig = false;
        } else {
            twoDig = true;
        }
        return (twoDig);
    }
}
