package _5_ListExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class _3_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> listOfGuest = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command.length == 3) {
                listOfGuest = isGoing(command, listOfGuest);
            } else if (command.length == 4) {
                listOfGuest = isNotGoing(command, listOfGuest);

            }
        }
        printListOfGuest(listOfGuest);
    }

    private static ArrayList<String> isGoing(String[] command, ArrayList<String> listOfGuest) {
        if (listOfGuest.size() == 0) {
            listOfGuest.add(command[0]);
            return listOfGuest;
        }
        int count =0;
        for (int i = 0; i < listOfGuest.size(); i++) {
            if (command[0].equals(listOfGuest.get(i))) {
                System.out.println(command[0] + " is already in the list!");
                return listOfGuest;
            } else {
                count++;
            }
            if(count==listOfGuest.size()) {
                listOfGuest.add(command[0]);
                return listOfGuest;
            }
        }
        return listOfGuest;
    }

    private static ArrayList<String> isNotGoing(String[] command, ArrayList<String> listOfGuest) {
        if (listOfGuest.size() == 0) {
            System.out.println(command[0] + " is not in the list!");
            return listOfGuest;
        }
        int count = 0;
        for (int i = 0; i < listOfGuest.size(); i++) {
            if (command[0].equals(listOfGuest.get(i))) {
                listOfGuest.remove(command[0]);
                return listOfGuest;
            } else {
                count++;
            }
            if (count == listOfGuest.size()) {
                System.out.println(command[0] + " is not in the list!");
            }
        }
        return listOfGuest;
    }

    private static void printListOfGuest(ArrayList<String> listOfGuest) {
        for (String s : listOfGuest) {
            System.out.println(s);
        }
    }
}
