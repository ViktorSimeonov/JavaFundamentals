package _5_ListLab;

import java.util.ArrayList;
import java.util.Scanner;

public class _5_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Integer> numbers = createArrList(input);
        String nextLine = scanner.nextLine();
        // boolean end = false;
        while (!"end".equals(nextLine)) {
            String[] step = nextLine.split(" ");
            String command = step[0];
            int firstNum = 0;
            int secondNum = 0;
            String firstString = step[1];
            switch (command) {
                case "Contains":
                    firstNum = Integer.parseInt(step[1]);
                    if (numbers.contains(firstNum)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if ("even".equals(firstString)) {
                        printEven(numbers);
                    }
                    if ("odd".equals(firstString)) {
                        printOdd(numbers);
                    }
                    //numbers.remove(Integer.valueOf(firstNum));
                    break;
                case "Get":
                    if ("sum".equals(firstString)) {
                        printSum(numbers);
                    }
                    break;
                case "Filter":
                    secondNum = Integer.parseInt(step[2]);
                    if (firstString.length() == 1) {
                        // '<' is 60, and '>' is 62
                        char firstChar = firstString.charAt(0);
                        // int valueOfChar = (int) firstChar;
                        if ((int) firstChar == 60) {
                            printLessThen(numbers, secondNum);
                        } else if ((int) firstChar == 62) {
                            printBiggerThen(numbers, secondNum);
                        }
                    } else if (firstString.length() == 2) {
                        if ("<=".equals(firstString)) {
                            printLessOrEqualTo(numbers, secondNum);
                        } else if (">=".equals(firstString)) {
                            printBiggerOrEqualTo(numbers, secondNum);
                        }
                    }
                    break;

            }

            nextLine = scanner.nextLine();
            /*if ("end".equals(nextLine)) {
               // end = true;

            }*/
        }
       /* if (end) {
            printNumbers(numbers);

        }*/

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
        System.out.println();
    }

    private static void printEven(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i);
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    private static void printOdd(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i);
            if (x % 2 == 1) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    private static void printSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }

    private static void printLessThen(ArrayList<Integer> numbers, int secondNum) {
        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i);
            if (x < secondNum) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    private static void printBiggerThen(ArrayList<Integer> numbers, int secondNum) {
        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i);
            if (x > secondNum) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    private static void printLessOrEqualTo(ArrayList<Integer> numbers, int secondNum) {
        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i);
            if (x <= secondNum) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    private static void printBiggerOrEqualTo(ArrayList<Integer> numbers, int secondNum) {
        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i);
            if (x >= secondNum) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
}
