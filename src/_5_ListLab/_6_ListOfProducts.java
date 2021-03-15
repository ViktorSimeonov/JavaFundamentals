package _5_ListLab;

import java.util.*;

public class _6_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> listProduct = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            listProduct.add(product);
        }
        Collections.sort(listProduct);
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println((i + 1) + "." + listProduct.get(i));
        }

    }

   /* private static void createList(int n) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listProduct = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            listProduct.add(product);
        }
        Collections.sort(listProduct);
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println((i+1)+"."+listProduct.get(i));
        }
    }*/
}
