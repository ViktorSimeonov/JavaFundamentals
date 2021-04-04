package HackerRank30Days;

import java.util.*;

public class _4_ClassVSInstance {
    // in hackerrank static is replaced with public class Person
        static class Person {
        private int age;

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            this.age = initialAge;
            if (initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
                setAge(0);

            } else {
                setAge(initialAge);
            }
            /*amIOld();
            yearPasses();
            System.out.println();*/
        }

        public void amIOld() {
            if (getAge() < 13) {
                System.out.println("You are young.");
            } else if (getAge() >= 13 && getAge() < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");

            }
            // Write code determining if this person's age is old and print the correct statement:
        }

        public void yearPasses() {
            // Increment this person's age.
            setAge(age + 1);

        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int age = sc.nextInt();
                Person p = new Person(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
            sc.close();
        }


    }
}
