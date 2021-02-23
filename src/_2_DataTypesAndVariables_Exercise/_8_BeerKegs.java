package _2_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class _8_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double theBiggestKeg = Double.MIN_VALUE;
        String theNameOfTheChampion = "";
        for (int i = 0; i < n; i++) {
            String modelKeg = scanner.nextLine();
            double radiusKeg = Double.parseDouble(scanner.nextLine());
            int heightKeg = Integer.parseInt(scanner.nextLine());
            double valueOfTheKeg = Math.PI*Math.pow(radiusKeg,2)*heightKeg;
            if ( valueOfTheKeg >= theBiggestKeg){
                theBiggestKeg=valueOfTheKeg;
                theNameOfTheChampion=modelKeg;
            }
        }
        System.out.println(theNameOfTheChampion);
    }
}
