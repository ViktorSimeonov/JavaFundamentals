package _2_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class _10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int powerPokeN = Integer.parseInt(scanner.nextLine());
        int targetPokeM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int count=0;
        int powerAfterPoke=powerPokeN;
        boolean end = false;
            while (powerAfterPoke>targetPokeM){
                powerAfterPoke-=targetPokeM;
                count++;
                if(powerAfterPoke==(powerPokeN/2)){
                System.out.println(powerAfterPoke/exhaustionFactorY);
                end = true;
                break;
                }
        }
            if(false){
                System.out.println(powerAfterPoke);
            }
        System.out.println(count);
    }
}
