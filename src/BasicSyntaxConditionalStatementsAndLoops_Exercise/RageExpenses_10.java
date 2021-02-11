package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double allPrice = 0;
        int count = 0;
        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                allPrice += headsetPrice;
            }
            if (i % 3 == 0) {
                allPrice += mousePrice;
            }
            if (i % 6 == 0) {
                allPrice += keyboardPrice;
                count++;
                if (count % 2 == 0) {
                    allPrice += displayPrice;
                }
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", allPrice);
    }
}
