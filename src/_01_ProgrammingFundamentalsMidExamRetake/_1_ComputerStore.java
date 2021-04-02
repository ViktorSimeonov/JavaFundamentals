package _01_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _1_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double price = 0;
        while (!("special".equals(input) || "regular".equals(input))) {
            if (Double.parseDouble(input) < 0) {
                System.out.println("Invalid price!");
            } else {
                price += Double.parseDouble(input);
            }

            input = scanner.nextLine();
        }
        double taxes = price * 0.2;
        double finalPrice = taxes + price;
        if (price == 0) {
            System.out.println("Invalid order!");
        } else {
            if (input.equals("special")) {
                finalPrice *= 0.9;
                System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$%n",
                        price, taxes, finalPrice);

            }else{
                System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$%n",
                        price, taxes, finalPrice);
            }
        }
    }

}


//https://judge.softuni.bg/Contests/Practice/Index/2517#0