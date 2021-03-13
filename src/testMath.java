import java.util.Scanner;

public class testMath {
    public static void main(String[] args) {
//        int x = 23;
//        int first = x%10;
//        int result = x/10;
//        System.out.println(first);
//        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        //  int length = String.valueOf(input).length();
        topNumbers(input);

    }

    private static void topNumbers(int input) {

        for (int i = 10; i < input; i++) {
            int sum = 0;
            int runNumber = i;
            while (runNumber > 0) {
                int num = runNumber % 10;
                runNumber = runNumber / 10;
                //  System.out.println(num);
                sum += num;
            }
            if (sum % 8 == 0) {
                oneOddNumber(i);

            }
        }
    }
    private static void oneOddNumber(int n) {
        int runNumber = n;
        while (runNumber > 0) {
            int num = runNumber % 10;
            if (num % 2 != 0) {
                System.out.println(n);
                break;
            }
            runNumber = runNumber / 10;
        }

    }
}
