package _01_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _2_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waiting = Integer.parseInt(scanner.nextLine());
        String[] liftCabin = scanner.nextLine().split(" ");
        int[] cabinPlace = new int[liftCabin.length];
        for (int i = 0; i < liftCabin.length; i++) {
            cabinPlace[i] = Integer.parseInt(liftCabin[i]);
        }
        boolean emptySpots = false;
        while (waiting > 0) {
            if (emptySpots) {
                break;
            }
            for (int i = 0; i < cabinPlace.length; i++) {
                if (cabinPlace[i] < 4) {
                    if (waiting < (4 - cabinPlace[i])) {
                        cabinPlace[i] = waiting;
                        emptySpots = true;
                        break;
                    } else {
                        waiting -= (4 - cabinPlace[i]);
                        cabinPlace[i] = 4;
                    }
                    if ((i == (cabinPlace.length - 1)) & (waiting != 0)) {
                        System.out.printf("There isn't enough space! %d people in a queue!%n", waiting);
                        for (int k : cabinPlace) {
                            System.out.print(k + " ");
                        }
                        break;
                    }
                }

            }
        }
        if (emptySpots) {
            System.out.println("The lift has empty spots!");
            for (int i : cabinPlace) {
                System.out.print(i + " ");

            }
        } else {
            for (int i : cabinPlace) {
                System.out.print(i + " ");
            }
        }
    }
}