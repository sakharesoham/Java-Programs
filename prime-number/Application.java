import java.util.Scanner;

// Program to display whether given input number is prime or not
public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int temp = 0;
        for (int i = 2; i <= input / 2; i++) {
            temp++;
        }
        if (temp == 0) {
            System.out.println("No is Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}
