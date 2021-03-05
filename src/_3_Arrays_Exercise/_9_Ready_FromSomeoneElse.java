package _3_Arrays_Exercise;

import java.util.Scanner;

public class _9_Ready_FromSomeoneElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthOfSequences = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int coutPreviousElement = 0, generalCounter = 0, indexPrevious = 0, curentSum = 0, previousSum = 0,
                bestSequenceIndex = 0, bestSequenceSum = 0;
        int[] outputArray = new int[lengthOfSequences];
        while (!input.equals("Clone them!")) {
            generalCounter++;
            String[] array = input.split("!+");
            int[] integerArray = new int[array.length];

            for (int i = 0; i < integerArray.length; i++) {
                integerArray[i] = Integer.parseInt(array[i]);
            }
            int curentCounter = 1, counter = 0, index = 0;
            if (integerArray.length == 1) {
                counter = 1;
            }
            for (int i = 0; i < integerArray.length - 1; i++) {
                if (integerArray[i] == 1) {
                    curentSum += 1;
                }
                // проверява текущия и следващия дали е = 1
                if (integerArray[i] == integerArray[i + 1] && integerArray[i] == 1) {
                    curentCounter++;
                    if (counter < curentCounter) {
                        counter = curentCounter;
                        index = i;
                    }
                } else {
                    if (counter < curentCounter) {
                        counter = curentCounter;
                    }
                    curentCounter = 1;
                }
            }
            if (coutPreviousElement == counter) {
                if (indexPrevious == index && curentSum > previousSum) {
                    for (int i = 0; i < integerArray.length; i++) {
                        outputArray[i] = integerArray[i];
                    }
                    bestSequenceIndex = generalCounter;
                } else if (indexPrevious > index) {
                    for (int i = 0; i < integerArray.length; i++) {
                        outputArray[i] = integerArray[i];
                    }
                    bestSequenceIndex = generalCounter;
                }
                ///tuk
            } else if (coutPreviousElement < counter) {
                for (int i = 0; i < integerArray.length; i++) {
                    outputArray[i] = integerArray[i];
                }
                bestSequenceIndex = generalCounter;
                coutPreviousElement = counter;
                previousSum = curentSum;
            }
            indexPrevious = index;
            curentSum = 0;
            input = scan.nextLine();
        }
        for (int i = 0; i < outputArray.length; i++) {
            if (outputArray[i] == 1) {
                bestSequenceSum++;
            }
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSequenceSum);
        for (int i : outputArray) {
            System.out.print(i + " ");
        }

    }

}