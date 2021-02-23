package _2_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class _9_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int quantity = 0;
        while (startingYield >= 100) {
            days++;
            quantity += startingYield;
            if(quantity<=26){
                quantity=0;
            }else{
                quantity-=26;
            }
            startingYield -= 10;
        }
        if(quantity<=26){
            quantity=0;
        }else{
            quantity-=26;
        }
        System.out.println(days);
        System.out.println(quantity);
    }
}
