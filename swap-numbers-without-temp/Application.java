import java.util.Scanner;

// Program to swap give input numbers without using third variable
public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to Swapping of 2 numbers without Temp variable");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter a and b ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.printf("The swapped values of a is %d and b is %d", a, b);
        } catch (Exception e) {
            System.out.println("Exception caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
