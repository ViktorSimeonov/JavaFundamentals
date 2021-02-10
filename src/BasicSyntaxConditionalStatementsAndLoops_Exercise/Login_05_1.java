package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Login_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        int count = 0;
        String passWord;
        String oposit = "";
        int howLong = userName.length();
        for (int i = howLong - 1; i >= 0; i--) {
            char a = userName.charAt(i);
            oposit += a;
        }
        while (!oposit.equals(passWord = scanner.nextLine())) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");

        }
        if (oposit.equals(passWord)) {
            System.out.printf("User %s logged in.", userName);
        }
    }
}
