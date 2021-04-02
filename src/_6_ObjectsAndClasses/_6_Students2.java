package _6_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _6_Students2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!line.equals("end")) {
            // Тази иницализация можем да я заместим с Student s = Student.parseStudent(line);
            /*String[] studentParameters = line.split(" ");
            Student s = new Student(studentParameters[0], studentParameters[1],
                    Integer.parseInt(studentParameters[2]), studentParameters[3]);*/
            Student s = Student.parseStudent(line);


            //TODO:overwrite if matching first and last name
            int existingIndex = findStudentIndex(students, s.firstName, s.lastName);
            if (existingIndex!=-1){
            students.get(existingIndex).sethomeTown(s.homeTown);
            students.get(existingIndex).setAge(s.age);

            }else{
                //пълним листа students
                students.add(s);
            }


            line = scanner.nextLine();
        }
        String searchHomeTown = scanner.nextLine();
        for (Student student : students) {
            if (student.getHomeTown().equals(searchHomeTown)) {
                //това принтиране го изнасяме в метод toString, пишем toString i enter
                /*System.out.printf("%s %s is %d years old.%n",
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge());*/
                System.out.println(student);
            }
        }


    }

    static int findStudentIndex(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getFirstName().equals(firstName)&&
            students.get(i).getLastName().equals(lastName)){
                return i;
            }
        }
        return -1;
    }

    static class Student {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        //създаваме конструктор, за да можем да ги въведем още при създаването
        //ако не искаме да пишем всичко по долу ( на изпита да не губим време
        //натискаме Alt+Insert
        Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public static Student parseStudent(String string) {
            String[] studentParameters = string.split(" ");
            return new  Student(studentParameters[0], studentParameters[1],
                    Integer.parseInt(studentParameters[2]), studentParameters[3]);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public String sethomeTown(String homeTown) {
            return this.homeTown = homeTown;
        }

        public int setAge(int age) {
            return this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %d years old",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge());
        }

    }
}
