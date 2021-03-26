package _7_BitwiseOperations;


public class _0_FromBinaryToDecimal {
    public static void main(String[] args) {
        String num = "1000111";
        int number = Integer.parseInt(num);
        int sum=0;
        int magnitude=1;
        for (int i = 0; i < num.length(); i++) {
            int digit = number%10;
            number = number/10;
            sum = sum +digit*magnitude;
            magnitude=magnitude*2;


        }
        System.out.println(sum);

    }
}
