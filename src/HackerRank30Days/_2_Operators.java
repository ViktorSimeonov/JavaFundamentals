package HackerRank30Days;

import java.util.Scanner;


public class _2_Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tips = (meal_cost*tip_percent)/100;
        double tax = (meal_cost*tax_percent)/100;
        double sum = meal_cost+tips+tax;
        System.out.printf("%.0f",sum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = Double.parseDouble(scanner.nextLine());

        int tip_percent = Integer.parseInt(scanner.nextLine());

        int tax_percent = Integer.parseInt(scanner.nextLine());

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
