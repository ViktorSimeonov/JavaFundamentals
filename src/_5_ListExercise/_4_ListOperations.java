package _5_ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] input = scanner.nextLine().split(" ");
        while (!"End".equals(input[0])) {
            switch (input[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(input[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(input[2]) >= 0 &&Integer.parseInt(input[2]) < numbers.size()) {
                        int index = Integer.parseInt(input[2]);
                        int element = Integer.parseInt(input[1]);
                        numbers.add(index, element);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                if (Integer.parseInt(input[1]) >= 0 &&Integer.parseInt(input[1]) < numbers.size()) {
                    numbers.remove(Integer.parseInt(input[1]));
                } else {
                    System.out.println("Invalid index");

                    }
                    break;
                case "Shift":
                    if (input[1].equals("left")) {
                        int count = Integer.parseInt(input[2]);
                        numbers = shiftLeft(numbers, count);
                    } else if (input[1].equals("right")) {
                        int count = Integer.parseInt(input[2]);
                        numbers = shiftRight(numbers, count);
                    }
                    break;
            }

            input = scanner.nextLine().split(" ");
            if (input[0].equals("End")) {
                printList(numbers);
            }
        }

    }

    private static List<Integer> shiftLeft(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int firstNum = numbers.get(0);
            for (int j = 0; j < (numbers.size() - 1); j++) {
                numbers.set(j, numbers.get(j + 1));
            }
            numbers.set(numbers.size() - 1, firstNum);
        }
        return numbers;
    }

    private static List<Integer> shiftRight(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int lastNum = numbers.get(numbers.size() - 1);
            for (int j = (numbers.size() - 1); j > 0; j--) {
                numbers.set(j, numbers.get(j - 1));
            }
            numbers.set(0, lastNum);
        }
        return numbers;

    }

    private static void printList(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

}
