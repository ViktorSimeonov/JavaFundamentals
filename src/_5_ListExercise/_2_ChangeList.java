package _5_ListExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class _2_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Integer> listIntegers = createList(input);
        String[] command = scanner.nextLine().split(" ");
        while (!"end".equals(command[0])) {
            switch (command[0]) {
                case "Delete":
                    int x = Integer.parseInt(command[1]);
                    for (int i = 0; i < listIntegers.size(); i++) {
                        if (x == listIntegers.get(i)) {
                            listIntegers.remove(i);
                            i--;

                        }
                    }
                    break;
                case "Insert":
                    listIntegers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;
            }
            command = scanner.nextLine().split(" ");
            if (command[0].equals("end")) {
                for (int i = 0; i < listIntegers.size(); i++) {
                    System.out.print(listIntegers.get(i) + " ");
                }
            }
        }

    }

    private static ArrayList<Integer> createList(String input) {
        String[] arr = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            int x = Integer.parseInt(s);
            list.add(x);

        }
        return list;
    }

}
