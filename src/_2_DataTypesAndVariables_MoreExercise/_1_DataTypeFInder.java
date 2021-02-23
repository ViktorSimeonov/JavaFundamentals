package _2_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class _1_DataTypeFInder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (!"END".equals(input = scanner.nextLine())) {
            String dataType="";
            boolean isInt = false;
            boolean isFloat = false;
            int count = 0;
            if (input.length() == 1 && !(48 <= input.charAt(0) && input.charAt(0) <= 57)) {
                dataType = "character";
                System.out.printf("%s is %s type%n", input,dataType);
            } else if ("false".equals(input) || "true".equals(input) || "FALSE".equals(input) || "TRUE".equals(input)) {
                dataType = "boolean";
                System.out.printf("%s is %s type%n", input,dataType);
            } else {
                for (int i = 0; i < input.length(); i++) {
                    int num = input.charAt(i);
                    if (num == 46) {
                        dataType="floating point";
                        System.out.printf("%s is %s type%n", input,dataType);
                        isFloat = true;
                    }
                }
                for (int j = 0; j < input.length(); j++) {
                    int num1 = input.charAt(j);
                    if (48 <= num1 && num1 <= 57 || num1 == 45 || num1 == 43) {
                        count++;
                    }
                    if (count == input.length()) {
                        dataType="integer";
                        System.out.printf("%s is %s type%n", input,dataType);
                        isInt = true;
                    }
                }
                if (!isFloat && !isInt) {
                    dataType="string";
                    System.out.printf("%s is %s type%n", input,dataType);
                }


            }
        }
    }
}