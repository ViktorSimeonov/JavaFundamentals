package _4_Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _11_ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().
                split(" ")).mapToInt(Integer::parseInt).toArray();

        String input;
        while (!"end".equals(input = scanner.nextLine())) {
            comands(input, numbers);
        }
        // call for method print array
        printArray(numbers);
    }

    private static void comands(String input, int[] numbers) {
        String[] splittedCommand = input.split(" ");
        if ("exchange".equals(splittedCommand[0])) {
            int splitIndex = Integer.parseInt(splittedCommand[1]);
            if (splitIndex >= numbers.length) {
                System.out.println("Invalid index");
            } else {
                numbers = exchangedArray(splitIndex, numbers);

            }
        }
        if ("max".equals(splittedCommand[0])) {
            if (splittedCommand[1].equals("even")) {
                int maxEvenIndex = maxEven(numbers);
                if (maxEvenIndex < 0) {
                    System.out.println("No matches");
                } else {
                    System.out.println(maxEvenIndex);
                }
            }
            if (splittedCommand[1].equals("odd")) {
                int minOddIndex = maxOdd(numbers);
                if (minOddIndex < 0) {
                    System.out.println("No matches");
                } else {
                    System.out.println(minOddIndex);
                }
            }
        }
        if ("min".equals(splittedCommand[0])) {
            if (splittedCommand[1].equals("even")) {
                int minEvenIndex = minEven(numbers);
                if (minEvenIndex < 0) {
                    System.out.println("No matches");
                } else {
                    System.out.println(minEvenIndex);
                }
            }
            if (splittedCommand[1].equals("odd")) {
                int minOddIndex = minOdd(numbers);
                if (minOddIndex < 0) {
                    System.out.println("No matches");
                } else {
                    System.out.println(minOddIndex);
                }
            }
        }
        if ("first".equals(splittedCommand[0])) {
            if ("even".equals(splittedCommand[2])) {
                int count = Integer.parseInt(splittedCommand[1]);
                if (count > numbers.length) {
                    System.out.println("Invalid count");
                    return;
                }
                int[] firstEvenIndex = firstEven(numbers, count);
                int sizeArray = checkSizeArrayFirstEven(numbers,count);
                if (sizeArray == 0) {
                    System.out.println("[]");
                } else {
                    printArray(firstEvenIndex);
                }
            }
            if ("odd".equals(splittedCommand[2])) {
                int count = Integer.parseInt(splittedCommand[1]);
                if (count > numbers.length) {
                    System.out.println("Invalid count");
                    return;
                }
                int[] firstOddIndex = firstOdd(numbers, count);
                int sizeArray = checkSizeArrayFirstOdd(numbers,count);
                if (sizeArray == 0) {
                    System.out.println("[]");
                } else {
                    printArray(firstOddIndex);
                }

            }
        }
        if ("last".equals(splittedCommand[0])) {
            if ("even".equals(splittedCommand[2])) {
                int count = Integer.parseInt(splittedCommand[1]);
                if (count > numbers.length) {
                    System.out.println("Invalid count");
                    return;
                }
                int[] lastEvenIndex = lastEven(numbers, count);
                int sizeArray = checkSizeArrayLastEven(numbers, count);
                if (sizeArray == 0) {
                    System.out.println("[]");
                } else {
                    printArray(lastEvenIndex);
                }

            }


            if ("odd".equals(splittedCommand[2])) {
                int count = Integer.parseInt(splittedCommand[1]);
                if (count > numbers.length) {
                    System.out.println("Invalid count");
                    return;
                }
                int[] lastOddIndex = lastOdd(numbers, count);
                int sizeArray = checkSizeArrayLastOdd(numbers, count);
                if (sizeArray == 0) {
                    System.out.println("[]");
                } else {
                    printArray(lastOddIndex);
                }

            }
        }
    }

    private static int[] zeroIndex(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                int[] newShortArray = new int[numbers.length - 1];

            }
        }
        return (numbers);
    }

    private static int[] exchangedArray(int splitIndex, int[] numbers) {
        for (int i = 0; i <= splitIndex; i++) {
            int lastIndex = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = lastIndex;
        }

        // System.out.println("]");
        return (numbers);
    }

    private static int maxEven(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int indexEven = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (numbers[i] >= maxEven) {
                    maxEven = numbers[i];
                    indexEven = i;
                }
            }
        }
        return (indexEven);
    }

    private static int maxOdd(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int indexOdd = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                if (numbers[i] >= maxOdd) {
                    maxOdd = numbers[i];
                    indexOdd = i;
                }
            }
        }
        return (indexOdd);
    }

    private static int minEven(int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int indexEven = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (numbers[i] <= minEven) {
                    minEven = numbers[i];
                    indexEven = i;
                }
            }
        }
        return (indexEven);
    }

    private static int minOdd(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int indexOdd = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                if (numbers[i] <= minOdd) {
                    minOdd = numbers[i];
                    indexOdd = i;
                }
            }
        }
        return (indexOdd);
    }

    private static int[] firstEven(int[] numbers, int count) {
        int arrayDimension = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                arrayDimension++;
            }
        }
        if (arrayDimension > count) {
            arrayDimension = count;
        }
        int[] firstEvenIndex = new int[arrayDimension];
        arrayDimension = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                firstEvenIndex[arrayDimension] = numbers[i];
                arrayDimension++;
                if (arrayDimension == count) {
                    break;
                }
            }
        }
        return (firstEvenIndex);
    }

    private static int checkSizeArrayFirstEven(int[] numbers, int count) {
        int arrayDimension = 0;
        int sizeArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                arrayDimension++;
            }
        }
        if (arrayDimension > count) {
            arrayDimension = count;
        }
        int[] firstEvenIndex = new int[arrayDimension];
        arrayDimension = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                firstEvenIndex[arrayDimension] = numbers[i];
                arrayDimension++;
                sizeArray++;
                if (arrayDimension == count) {
                    break;
                }
            }
        }
        return (sizeArray);
    }

    private static int[] firstOdd(int[] numbers, int count) {
        int arrayDimension = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                arrayDimension++;
            }
        }
        if (arrayDimension > count) {
            arrayDimension = count;
        }
        int[] firstOddIndex = new int[arrayDimension];
        arrayDimension = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                firstOddIndex[arrayDimension] = numbers[i];
                arrayDimension++;
                if (arrayDimension == count) {
                    break;
                }
            }
        }
        return (firstOddIndex);
    }

    private static int checkSizeArrayFirstOdd(int[] numbers, int count) {
        int arrayDimension = 0;
        int sizeArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                arrayDimension++;
            }
        }
        if (arrayDimension > count) {
            arrayDimension = count;
        }
        int[] firstOddIndex = new int[arrayDimension];
        arrayDimension = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                firstOddIndex[arrayDimension] = numbers[i];
                arrayDimension++;
                sizeArray++;
                if (arrayDimension == count) {
                    break;
                }
            }
        }
        return (sizeArray);
    }

    private static int[] lastEven(int[] numbers, int count) {
        int arrayDimension = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                arrayDimension++;
            }
        }
        if (arrayDimension > count) {
            arrayDimension = count;
        }
        int[] lastEvenIndex = new int[arrayDimension];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                lastEvenIndex[arrayDimension - 1] = numbers[i];
                arrayDimension--;
                if ((arrayDimension - 1) == -1) {
                    break;
                }
            }
        }
        return (lastEvenIndex);
    }

    private static int checkSizeArrayLastEven(int[] numbers, int count) {
        int arrayDimension = 0;
        int sizeArray = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                arrayDimension++;
            }
        }
        if (arrayDimension > count) {
            arrayDimension = count;
        }
        int[] lastEvenIndex = new int[arrayDimension];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                lastEvenIndex[arrayDimension - 1] = numbers[i];
                arrayDimension--;
                sizeArray++;
                if ((arrayDimension - 1) == -1) {
                    break;
                }
            }
        }
        return (sizeArray);
    }

    private static int[] lastOdd(int[] numbers, int count) {
        int arrayDimension = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                arrayDimension++;
            }
        }
        if (arrayDimension > count) {
            arrayDimension = count;
        }
        int[] lastOddIndex = new int[arrayDimension];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                lastOddIndex[arrayDimension - 1] = numbers[i];
                arrayDimension--;
                if ((arrayDimension - 1) == -1) {
                    break;
                }
            }
        }
        return (lastOddIndex);
    }

    private static int checkSizeArrayLastOdd(int[] numbers, int count) {
        int arrayDimension = 0;
        int sizeArray = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                arrayDimension++;
            }
        }
        if (arrayDimension > count) {
            arrayDimension = count;
        }
        int[] lastOddIndex = new int[arrayDimension];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                lastOddIndex[arrayDimension - 1] = numbers[i];
                arrayDimension--;
                sizeArray++;
                if ((arrayDimension - 1) == -1) {
                    break;
                }
            }
        }
        return (sizeArray);
    }

    private static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + "," + " ");
            } else {
                System.out.println(numbers[i] + "]");
            }

        }
    }
}


