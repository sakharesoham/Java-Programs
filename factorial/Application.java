// Program to display factorial of given input number
// Input: Any positive integer

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.printf("Please enter the number ");
            int num = scan.nextInt();
            int fact = 1;
            for (int i = num; i >= 1; i--) {
                fact = fact * i;
            }
            System.out.printf("Factorial of %d is %d", num, fact);
        } catch (Exception e) {
            System.out.println("Exception caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
