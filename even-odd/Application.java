// Program to find out whether given input number is even or odd

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is odd");
            }
        } catch (Exception e) {
            System.out.println("Exception caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
