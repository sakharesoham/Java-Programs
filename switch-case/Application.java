// Write a program to demonstrate switch-case expression
// Input: Enter from 1 to 12, the number of months in a Calendar Year.

import java.util.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to Switch Case Program");
        System.out.printf("Enter number to display the month of the year: ");
        Scanner scan = new Scanner(System.in);
        try {
            int month = scan.nextInt();

            switch (month) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("You are in Different World");
            }
        } catch (Exception e) {
            System.out.println("Exception caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
