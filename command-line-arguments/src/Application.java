// Program to accept command line arguments from user and display those values
//Input: Name and Age

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.printf("Please enter your name: ");
            String firstName = scan.nextLine();

            System.out.printf("Enter your Age: ");
            int age = scan.nextInt();

            System.out.printf("Your Name is %s and age is %d ", firstName, age);
        } catch (Exception e) {
            System.out.println("Exception caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}