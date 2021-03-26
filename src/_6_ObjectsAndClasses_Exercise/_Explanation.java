package _6_ObjectsAndClasses_Exercise;

import java.util.Scanner;

public class _Explanation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("Viktor", "Simenov", 5.66);
        Student student1 = new Student("Petia", "Simenova", 6.00);
        student.email = "toi.mail.bg";
        student.setAverageScore(5.99);
        System.out.println(student.studentInfo());
        System.out.println(student1.studentInfo());

    }

    static class Student {
        String firstName;
        String lastName;
        double averageScore;
        String email;

        Student(String fName, String lName, double avrScore) {
            this.firstName = fName;
            this.lastName = lName;
            this.averageScore = avrScore;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getAverageScore() {
            return averageScore;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAverageScore(double averageScore) {
            this.averageScore = averageScore;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public String studentInfo(){
            String message = String.format("First Name: %s%nLast Name: %s%nAverageScore: %.2f",
                    getFirstName(), getLastName(), getAverageScore());
            return message;
        }

    }

}

