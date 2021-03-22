package _6_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _7_OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Persons> persons = new ArrayList<>();
        while (!line.equals("End")){
            String[] input = line.split("\\s+");
            Persons people = new Persons(input[0],input[1],Integer.parseInt(input[2]));
            persons.add(people);
            line = scanner.nextLine();
        }
       List<Persons> sortedPersons = persons.stream().sorted(Comparator.comparing(Persons::getAge))
               .collect(Collectors.toList());
        for (Persons sortedPerson : sortedPersons) {
            System.out.println(sortedPerson.toString());
        }

    }
    static class Persons{
        String name;
        String iD;
        int age;
        Persons(String name, String iD, int age){
        this.name = name;
        this.iD = iD;
        this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getiD() {
            return iD;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    getName(),getiD(),getAge());
        }
    }
}
