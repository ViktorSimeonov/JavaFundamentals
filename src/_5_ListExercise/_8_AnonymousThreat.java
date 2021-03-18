package _5_ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _8_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        while (!"3:1".equals(command[0])) {
            switch (command[0]) {
                case "merge":
                    boolean isMerge = false;
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > input.size() - 1) {
                        endIndex = input.size() - 1;
                    }
                    String merge = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        merge += input.get(i);
                        isMerge = true;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        input.remove(startIndex);
                    }

                    if (isMerge) {
                        input.add(startIndex, merge);
                    }
                    break;
                case "divide":
                    int indexDivide = Integer.parseInt(command[1]);
                    int division = Integer.parseInt(command[2]);
                    String value = input.get(indexDivide);
                    int lengthOfValue = value.length();
                    int howManyChars = lengthOfValue / division;
                    int additionalToHowMany = lengthOfValue % division;
                    if (lengthOfValue % division == 0) {
                        input = divisionWithoutRemainder(howManyChars,value,division,input,indexDivide);

                    } else if(lengthOfValue % division != 0) {
                        input = divisionWithRemainder(additionalToHowMany, howManyChars,value,division,input,indexDivide);

                    }
                    break;

            }


            command = scanner.nextLine().split(" ");
        }
        for (String s : input) {
            System.out.printf(s + " ");
        }
    }

    private static List<String> divisionWithoutRemainder(int howManyChars, String value, int division, List<String> input, int indexDivide) {
        for (int i = 0; i < division; i++) {
            String temporary = "";

            for (int j = 0; j < howManyChars; j++) {
                temporary += value.charAt(j);

            }
            input.add(indexDivide + i, temporary);
            value = value.replaceFirst(temporary, "");
        }
        input.remove(input.size() - 1);
        return input;
    }

    private static List<String> divisionWithRemainder(int additionalToHowMany, int howManyChars, String value, int division, List<String> input, int indexDivide) {
        for (int i = 0; i < division; i++) {
            String temporary = "";
            if (i == division - 1) {
                for (int j = 0; j < howManyChars+additionalToHowMany; j++) {
                    temporary += value.charAt(j);
                }
                input.add(indexDivide + i, temporary);
                value = value.replaceFirst(temporary, "");
                break;
            }
            for (int j = 0; j < howManyChars; j++) {
                temporary += value.charAt(j);

            }
            input.add(indexDivide + i, temporary);
            value = value.replaceFirst(temporary, "");
        }
        input.remove(input.size() - 1);
        return input;
    }
}
