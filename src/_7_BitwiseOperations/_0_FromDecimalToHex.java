package _7_BitwiseOperations;

public class _0_FromDecimalToHex {
    public static void main(String[] args) {
        int num = 2000000;
        String result = "";

        while (num > 0) {
            int digit = num % 16;

            result =GetHexDigit( digit) + result;
            num = num / 16;
        }
        System.out.println(result);
    }

    private static String GetHexDigit(int digit) {
        String newDigit="";
        if(digit<=9){
            newDigit= ""+ digit;
        }else if(digit==10){
            newDigit= "A";
        }else if(digit==11){
            newDigit= "B";
        }else if(digit==12){
            newDigit= "C";
        }else if(digit==13){
            newDigit= "D";
        }else if(digit==14){
            newDigit= "E";
        }else if(digit==15){
            newDigit= "F";
        }else {
            System.out.println("Invalid digit");
        }
        return newDigit;
    }

}
