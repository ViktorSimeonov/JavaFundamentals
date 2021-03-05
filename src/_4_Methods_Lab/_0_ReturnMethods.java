package _4_Methods_Lab;

import java.util.Scanner;

public class _0_ReturnMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = readFullName(scanner);
        System.out.println(fullName);
    }
    public static String readFullName(Scanner sc) {
        String firstName = sc.nextLine();//Първото име прочетено от конзолата
        String lastName = sc.nextLine();// чете второто име
        return firstName + " " + lastName;// тук връща първото + второто име
    }
    //този метод е void и той не връща стойност
    public static void testMethod(){
        int a = 5;
        if(a==5){
            return;
        }
        System.out.println("tuk sme");
    }
}
