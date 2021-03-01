package Exam_28022021;

import java.util.Scanner;

public class _2_FootballKit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tShirt = Double.parseDouble(scanner.nextLine());
        double neededSum = Double.parseDouble(scanner.nextLine());

        double shorti=(tShirt*0.75);
        double socs = (tShirt*0.75)*0.2;
        double buton = 2*(tShirt+shorti);
        double price = (tShirt+shorti+socs+buton)*0.85;

        if (price>=neededSum){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.%n",price);
        }else{
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.%n",(neededSum-price));
        }
    }
}
