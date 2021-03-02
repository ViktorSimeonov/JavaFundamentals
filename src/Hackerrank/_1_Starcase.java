package Hackerrank;

//import java.util.Arrays;
import java.util.Scanner;

public class _1_Starcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if((n-i)>j){
                    System.out.printf(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}

