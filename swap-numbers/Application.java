import java.util.Scanner;

// Program to swap given input numbers
public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to the Program of Swapping Numbers");
        Scanner scan = new Scanner(System.in);
        try {
            int a, b, temp;
            System.out.println("Please enter two numbers a and b");
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.printf("The entered value of a is %d and b is %d\n", a, b);
            temp = a;
            a = b;
            b = temp;
            System.out.printf("The Swapped value of a is %d and b is %d", a, b);
        } catch (Exception e) {
            System.out.println("Exception caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
