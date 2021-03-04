package _4_Methods_Lab;

import java.util.Scanner;

public class _5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        switch (product){
            case "coffee":
                totalPriceCoffee(quantity);
                break;
            case "water":
                totalPriceWater(quantity);
                break;
            case "coke":
                totalPriceCoke(quantity);
                break;
            case "snacks":
                totalPriceSnacs(quantity);
                break;
        }
    }

    private static void totalPriceCoffee(int quantity) {
        System.out.printf("%.2f%n",(quantity*1.50));
    }private static void totalPriceWater(int quantity) {
        System.out.printf("%.2f%n",(quantity*1.00));
    }private static void totalPriceCoke(int quantity) {
        System.out.printf("%.2f%n",(quantity*1.40));
    }private static void totalPriceSnacs(int quantity) {
        System.out.printf("%.2f%n",(quantity*2.00));
    }
}
