// Program to display factorial using function recurssion
// Note: Plz explain me this program. This is copied from Internet.
import java.util.Scanner;
public class Application {

    static int recursion(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * recursion(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int fact = 1;
        fact = recursion(input);
        System.out.printf("Factorial is %d",fact);
    }
}
