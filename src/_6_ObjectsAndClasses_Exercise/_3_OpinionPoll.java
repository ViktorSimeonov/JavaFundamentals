package _6_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Persons> persons = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            Persons dataPersons = Persons.parsePersons(input);
            persons.add(dataPersons);
        }
        //сортира по им от поток :(
        persons.stream().filter(persons1 -> persons1.getAge() > 30)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(persons1 -> System.out.println(persons1.toString()));
    }

    static class Persons {
        String name;

        int age;

        public Persons(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static Persons parsePersons(String input) {
            String[] data = input.split(" ");

            return new Persons(data[0], Integer.parseInt(data[1]));
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", getName(), getAge());
        }
    }
}
