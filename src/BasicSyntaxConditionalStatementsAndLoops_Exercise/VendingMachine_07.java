package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double sum = 0;
        double price;
        boolean reachStart = false;
        while (!"End".equals(input = scanner.nextLine())) {
            if (!reachStart) {
                while (!"Start".equals(input)) {
                    double coin = Double.parseDouble(input);
                    if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                        sum += coin;
                    } else {
                        System.out.printf("Cannot accept %.2f%n", coin);
                    }
                    input = scanner.nextLine();
                    if (input.equals("Start")) {
                        reachStart = true;
                        break;
                    }
                }
            }
            // System.out.println(sum);
            //input = scanner.nextLine();
            switch (input) {
                case "Nuts":
                    price = 2;
                    if (price > sum) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= price;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    if (price > sum) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= price;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (price > sum) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= price;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (price > sum) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= price;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (price > sum) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= price;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                case "Start":
                    break;
                default:
//                    if (reachStart){
//                        break;
//                    }
                    System.out.println("Invalid product");
                    break;
            }
        }
        System.out.printf("Change: %.2f%n", sum);
    }
}
