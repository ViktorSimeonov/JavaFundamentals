package _4_Methods_Lab;

import java.util.Scanner;

public class _4_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        switch (action){
            case "add":
                add(x, y);
                break;
            case "multiply":
                multiply(x, y);
                break;
            case "subtract":
                substract(x, y);
                break;
            case "divide":
                divide(x, y);
                break;
        }
    }

    public static void add(int x, int y){
        int add = x+y;
        System.out.println(add);
    }

    public static void multiply(int x, int y){
        int multiply = x*y;
        System.out.println(multiply);
    }
    private static void substract(int x, int y) {
        int subtract = x-y;
        System.out.println(subtract);
    }private static void divide(int x, int y) {
        int divide = x/y;
        System.out.println(divide);
    }
}
