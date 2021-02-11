package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightSabrePrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        robePrice = countOfStudents*robePrice;
        lightSabrePrice = (countOfStudents+Math.ceil(countOfStudents*0.1))*lightSabrePrice;
        double numOfBelt = Math.floor(countOfStudents / 6.0);
        beltPrice = (countOfStudents - numOfBelt)*beltPrice;
        double neededMoney=robePrice+lightSabrePrice+beltPrice;
        if ( neededMoney <= amountOfMoney ){
            System.out.printf("The money is enough - it would cost %.2flv.%n",neededMoney);
        }else {
            System.out.printf("Ivan Cho will need %.2flv more.%n",(neededMoney-amountOfMoney));
        }
    }
}
