package _9_AssociativeArrays;

import java.util.*;

public class _2_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {
            String word = scanner.nextLine();
            String inputNewSynonums = scanner.nextLine();
            List<String> cuteSynonums = wordSynonyms.get(word);
            if (cuteSynonums == null) {
                cuteSynonums = new ArrayList<>();
                wordSynonyms.put(word,cuteSynonums);
            }
            cuteSynonums.add(inputNewSynonums);
        }
        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.println(entry.getKey()+ " - " + String.join(", ", entry.getValue()));

        }

    }
}
