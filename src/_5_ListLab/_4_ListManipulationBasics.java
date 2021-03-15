package _5_ListLab;

import java.util.ArrayList;
import java.util.Scanner;

public class _4_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Integer> numbers = createArrList(input);
        String nextLine = scanner.nextLine();
        boolean end = false;
        while (!"end".equals(nextLine)) {
            String[] step = nextLine.split(" ");
            String command = step[0];
            int firstNum = Integer.parseInt(step[1]);
            int secondNum;
            switch (command) {
                case "Add":
                    numbers.add(firstNum);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(firstNum));
                    break;
                case "RemoveAt":
                    numbers.remove(firstNum);
                    break;
                case "Insert":
                    secondNum = Integer.parseInt(step[2]);
                    numbers.add(secondNum, firstNum);
                    break;

            }

            nextLine = scanner.nextLine();
            if ("end".equals(nextLine)) {
                end = true;

            }
        }
        if (end) {
            printNumbers(numbers);
        }

    }

    private static ArrayList<Integer> createArrList(String input) {
        String[] arr = input.split(" ");
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            int x = Integer.parseInt(s);
            num.add(x);
        }
        return num;
    }

    private static void printNumbers(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
