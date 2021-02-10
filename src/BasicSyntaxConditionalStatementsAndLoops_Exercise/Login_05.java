package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        int count = 0;
        String passWord;
        //  Scanner scanner = new Scanner(System.in);
       // String input = "Geeks for Geeks";
        StringBuilder input = new StringBuilder();
        // append a string into StringBuilder input
        input.append(userName);
        // reverse StringBuilder input
        input.reverse();

        // print reversed String
       // System.out.printf("%s%n",input);
        String test = ""+input;
      //  System.out.println(test);

        while(!test.equals(passWord = scanner.nextLine())){
            count++;
            if(count ==4){
                System.out.printf("User %s blocked!",userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");

        }
        if (test.equals(passWord)){
            System.out.printf("User %s logged in.",userName);
        }
    }
}
