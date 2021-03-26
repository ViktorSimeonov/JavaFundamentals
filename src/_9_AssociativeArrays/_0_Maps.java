package _9_AssociativeArrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Arrays;

public class _0_Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double,Integer> numberOccurences = new TreeMap<>();

        String[] numbersAsString = scanner.nextLine().split(" ");

        for (int i = 0; i < numbersAsString.length; i++) {
            double number = Double.parseDouble(numbersAsString[i]);

            Integer occurances = numberOccurences.get(number);
            if(occurances==null){
                occurances=0;
            }
                numberOccurences.put(number,occurances+1);

        }
        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),+entry.getValue());
        }

    }
}
