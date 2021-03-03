package _4_Methods_Lab;

import java.util.Scanner;

public class _7_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repetition = Integer.parseInt(scanner.nextLine());

        String repeatedText = repeatString(text, repetition);
        System.out.println(repeatedText);
    }

    private static String repeatString(String text, int repetition) {
//       //решение със стринг билдър StringBuilder
//        StringBuilder result = new StringBuilder("");
//        result.append(text);
//        //преобразува StringBuilder в String
//        return result.toString();
        String result ="";
        for (int i = 0; i < repetition; i++) {
            result = result+text;

        }
        return result;
    }
}
