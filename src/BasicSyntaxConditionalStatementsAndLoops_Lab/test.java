package BasicSyntaxConditionalStatementsAndLoops_Lab;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2000 ; i++) {
            char a = (char)i;
            System.out.printf("%c-%d%n",a,i);
        }
    }
}
