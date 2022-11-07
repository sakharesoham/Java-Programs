import java.util.Scanner;

// Program to display sum of digits of given input number
public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, n;
        int number = scan.nextInt();
        while (number > 0) {
            n = number % 10;
            sum = sum + n;
            number = number / 10;
        }

        System.out.printf("The sum of the given number is %d", sum);

    }
}
