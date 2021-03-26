package _6_ObjectsAndClasses_MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_CompanyRoster {
    static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        String age;

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", position='" + position + '\'' +
                    ", department='" + department + '\'' +
                    ", email='" + email + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }

        public Employee(String name, double salary, String position, String department, String email, String age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public String getPosition() {
            return position;
        }

        public String getDepartment() {
            return department;
        }

        public String getEmail() {
            return email;
        }

        public String getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] lineEmloyee = line.split("\\s+");
            lineEmloyee = checkForEmailAndAge(lineEmloyee);
            Employee e = new Employee(lineEmloyee[0], Double.parseDouble(lineEmloyee[1]), lineEmloyee[2], lineEmloyee[3]
                    , lineEmloyee[4], lineEmloyee[5]);
            employees.add(e);
            List<String> departmentNames = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        }

    }

    private static String[] checkForEmailAndAge(String[] lineEmloyee) {
        String[] lineEmloyeeNew = new String[6];
        if (lineEmloyee.length == 4) {
            for (int i = 0; i < lineEmloyee.length; i++) {
                lineEmloyeeNew[i] = lineEmloyee[i];
            }
            lineEmloyeeNew[4] = "n/a";
            lineEmloyeeNew[5] = "-1";
        } else if (lineEmloyee.length == 5) {
            for (int i = 0; i < lineEmloyee.length; i++) {
                lineEmloyeeNew[i] = lineEmloyee[i];
            }
            boolean noEmail = true;
            for (int j = 0; j < lineEmloyee[4].length(); j++) {
                char a = lineEmloyee[4].charAt(j);
                char emailSymbol = '@';
                if (a == emailSymbol) {
                    noEmail = false;
                    lineEmloyeeNew[4] = lineEmloyee[4];
                    lineEmloyeeNew[5] = "-1";
                    break;
                }
            }
            if (noEmail) {
                lineEmloyeeNew[5] = lineEmloyee[4];
                lineEmloyeeNew[4] = "n/a";
            }

        } else {
            for (int i = 0; i < lineEmloyee.length; i++) {
                lineEmloyeeNew[i] = lineEmloyee[i];

            }
        }

        return lineEmloyeeNew;
    }
}
