// Program to identify whether given input year is a leap year or not

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int year = scan.nextInt();

            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                System.out.println("This is a leap year");
            } else if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("Not a leap year");
            }
        } catch (Exception e) {
            System.out.println("Exception caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}