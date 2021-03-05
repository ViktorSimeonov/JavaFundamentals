package _3_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _10_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // страрт 13:30 25022021
        int sizeOfField = Integer.parseInt(scanner.nextLine());
        int[] bugArray = new int[sizeOfField];
        String indexes = scanner.nextLine();
        int[] arrIndexes = Arrays.stream(indexes.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int arrIndex : arrIndexes) {
            bugArray[arrIndex] = 1;
        }
        String movement;
        int startIndex;
        int flyLength;
        String direction;
        while (!"end".equals(movement = scanner.nextLine())) {
            String[] movingDirection = movement.split(" ");
            startIndex = Integer.parseInt(movingDirection[0]);
            flyLength = Integer.parseInt(movingDirection[movingDirection.length - 1]);
            direction = movingDirection[1];
            if (direction.equals("right")) {
                if (startIndex == (bugArray.length - 1) && bugArray[startIndex] == 1) {
                    // от тук ще е кода
                    if (flyLength > 0) {
                        bugArray[bugArray.length - 1] = 0;
                    } else {
                        for (int i = 1; i <= bugArray.length; i++) {
                            if ((startIndex + (flyLength * i)) < 0)  {
                                bugArray[startIndex] = 0;
                                break;
                            }
                            if (bugArray[startIndex] == 1 && bugArray[startIndex + (flyLength * i)] != 1) {
                                bugArray[startIndex] = 0;
                                bugArray[startIndex + (flyLength * i)] = 1;
                                break;
                            }
                            //до тук
                        }
                    }
                } else if (startIndex > (bugArray.length - 1) || (startIndex < 0)) {
                    continue;
                } else {
                    for (int i = 1; i <= bugArray.length; i++) {
                        if ((startIndex + (flyLength * i)) > bugArray.length - 1) {
                            bugArray[startIndex] = 0;
                            break;
                        }
                        if (bugArray[startIndex] == 1 && bugArray[startIndex + (flyLength * i)] != 1) {
                            bugArray[startIndex] = 0;
                            bugArray[startIndex + (flyLength * i)] = 1;
                            break;
                        }
                    }
                }
            } else if (direction.equals("left")) {
                if (startIndex == 0 && bugArray[startIndex] == 1) {
                    //от тук

                    bugArray[0] = 0;
                    //до тук
                } else if (startIndex > (bugArray.length - 1) || (startIndex < 0)) {
                    continue;
                } else {
                    for (int i = 1; i <= bugArray.length; i++) {
                        if ((startIndex - (flyLength * i)) < 0) {
                            bugArray[startIndex] = 0;
                            break;
                        }
                        if (bugArray[startIndex] == 1 && bugArray[startIndex - (flyLength * i)] != 1) {
                            bugArray[startIndex] = 0;
                            bugArray[startIndex - (flyLength * i)] = 1;
                            break;
                        }
                    }
                }
            }
        }
        for (int j : bugArray) {
            System.out.print(j + " ");
        }
    }
}
