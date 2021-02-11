package _2_DataTypesAndVariables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class _3_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        BigDecimal A;
        A  = BigDecimal.valueOf(0);
        for (int i = 1; i <= n; i++) {
            BigDecimal bigDecimal = new BigDecimal(scanner.nextLine());
            A = A.add(bigDecimal);


        }
        System.out.println(A);
    }
}
