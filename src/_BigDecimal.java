import java.math.BigDecimal;
import java.util.Scanner;

public class _BigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        BigDecimal A = BigDecimal.valueOf(0);
        for (int i = 1; i <= n; i++) {
            BigDecimal bigDecimal = new BigDecimal(scanner.nextLine());
            A = A.add(bigDecimal);
        }
        System.out.println(A);
    }
}
//    BigDecimal number = new BigDecimal(0);
//number = number.add(BigDecimal.valueOf(2.5));
//        number = number.subtract(BigDecimal.valueOf(1.5));
//        number = number.multiply(BigDecimal.valueOf(2));
//        number = number.divide(BigDecimal.valueOf(2));
