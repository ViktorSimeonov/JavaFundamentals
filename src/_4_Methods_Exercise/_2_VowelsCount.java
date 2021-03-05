package _4_Methods_Exercise;

import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        vowelsInStringInput(input);
    }

    private static void vowelsInStringInput(String input) {
        int count=0;
        for (int i = 0; i < input.length(); i  ++) {
            char temp = input.charAt(i);
            if(temp=='a'||temp=='A'||temp=='E'||temp=='e'||temp=='O'||temp=='o'||
                    temp=='i'||temp=='I'||temp=='U'||temp=='u'){
                count++;
            }

        } System.out.println(count);
    }
}
