package _9_AssociativeArrays;

import java.util.*;

public class _00_MapsDimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> myMap = new HashMap<>();
        // HashMap при итериране не се знае как ще излязат на изхода няма ред
        Map<String, Integer> students = new HashMap<>();
        students.put("Gosho", 4);
        students.put("Pesho", 3);
        students.put("Vanko", 6);
        System.out.println(students.containsKey("Pesho"));
        System.out.println(students.containsValue(4));
        //LinkedHashMap от друга страна ги запазва както са въведени
        Map<String, Integer> students1 = new LinkedHashMap<>();
        students1.put("Gosho", 4);
        students1.put("Pesho", 3);
        students1.put("Vanko", 6);
        students1.remove("Vasko");
        //TreeMap е сортиран според техния ключ, ако са стрингове ги сортира по букви
        Map<String, Integer> students2 = new TreeMap<>();
        students2.put("Gosho", 4);
        students2.put("Vanko", 6);
        students2.put("Ani", 3);
        students2.keySet();
        students.values();
        for (String s : students2.keySet()) {
            System.out.println(s);
        }
        for (Map.Entry<String, Integer> student2 : students2.entrySet()) {
            System.out.println(student2.getKey());
            System.out.println(student2.getValue());
            System.out.println(student2.getClass());
        }
        if (students2.containsKey("Gosho")) {
            System.out.println("YES there is Gosho");
        }
        if (students2.containsValue(3)) {
            System.out.printf("Yes I have it :)");
        }

    }
    class  Person{
        String name="Pesho";


    }

}

