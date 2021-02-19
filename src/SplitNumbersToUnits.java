import java.util.Scanner;

public class SplitNumbersToUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        for (int i = firstNum; i <= secondNum; i++) {
            // пример 534823
            int units = i % 10; // 534823 % 10 = 3
            int tens = (i / 10) % 10; //534823 / 10= 53482 % 10 = 2
            int hundreds = (i / 100) % 10; // 534823 / 100 = 5348 % 10 = 8
            int thousands = (i / 1000) % 10; // 534823 / 1000 = 534 % 10 = 4
            int tenOfThousands = (i / 10000) % 10; // 534823 / 10000 = 53 % 10 = 3
            int hundredsOfThousands = i / 100000; // 534823 / 100000 = 5
            int sumEven = hundredsOfThousands + thousands + tens;
            int sumOdd = units + hundreds + tenOfThousands;
            if (sumEven == sumOdd) {
                System.out.printf("%d ", i);


            }
        }
    }
}