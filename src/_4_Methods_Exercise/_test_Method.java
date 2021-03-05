package _4_Methods_Exercise;

import java.util.Scanner;

public class _test_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //методи които НЕ шръщат резултат (void)

        printDate();
        //които връщат резултат e от тип int, double, String ....
        int sum= sum(5,6);
        System.out.println(sum);
    }
    static void printDate(){
        System.out.println("Today is my birthday");
    }
    static int sum(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}
