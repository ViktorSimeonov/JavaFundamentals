package _6_ObjectsAndClasses_Exercise;


import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class _5_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Students> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            Students s = new Students(input[0], input[1], Double.parseDouble(input[2]));
            students.add(s);
        }
        /*List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getCreatedOn))
                .collect(Collectors.toList());*/
        //reversed
     /*   List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getCreatedOn).reversed())
                .collect(Collectors.toList());*/
        // ТОЗИ РЕД 1 Е СЪЩОТО КАТО РЕД 2
        students.stream()
                .sorted((students1, students2) -> Double.compare(students2.getGrade(), students1.getGrade()))
                .forEach(students1 -> System.out.println(students1.toString()));

        //РЕД 2
        /*List<Students> sortedByGrade=students.stream()
                .sorted(Comparator.comparing(Students::getGrade).reversed())
                .collect(Collectors.toList());
        for (Students students1 : sortedByGrade) {
            System.out.println(students1.toString());
        }*/

    }

    static class Students {
        String firstName;
        String lastName;

        double grade;

        public Students(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", getFirstName(), getLastName(), getGrade());
        }

    }
}
/*
judje link
https://judge.softuni.bg/Contests/Compete/Index/1327#4
sort instruction

https://dev.to/codebyamir/sort-a-list-of-objects-by-field-in-java-3coj

5.	Students
        Write a program that receives n count of students and orders them by grade (in descending). Each student should have first name (string), last name (string) and grade (floating-point number).
        Input
        •	First line will be a number n
        •	Next n lines you will get a student info in the format "{first name} {second name} {grade}"
        Output
        •	Print each student in the following format "{first name} {second name}: {grade}"
        Example
        Input
4
Lakia Eason 3.90
Prince Messing 5.49
Akiko Segers 4.85
Rocco Erben 6.00

        Output
        Rocco Erben: 6.00
        Prince Messing: 5.49
        Akiko Segers: 4.85
        Lakia Eason: 3.90
        */
