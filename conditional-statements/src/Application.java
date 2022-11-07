// Write a program to demonstrate conditional statements (if-else)
//Input: Positive Integer

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.printf("Please enter Positive Integer: ");

            int number = scan.nextInt();

            if (number >= 0) {
                System.out.println("Correct Input");
            } else {
                System.out.println("Incorrect Input");
            }
        } catch (Exception e) {
            System.out.println("Exception caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}