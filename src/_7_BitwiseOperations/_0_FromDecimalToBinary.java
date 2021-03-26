package _7_BitwiseOperations;

public class _0_FromDecimalToBinary {
    public static void main(String[] args) {
        int num = 2145;
        String result = "";

        while (num > 0) {
            int digit = num % 2;
            result = digit + result;
            num = num / 2;
        }
        System.out.println(result);
    }

}
