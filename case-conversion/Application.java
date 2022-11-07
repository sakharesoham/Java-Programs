// Program to convert lowercase characters to uppercase and vice-versa

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.printf("Please enter characters in Lower Case: ");
            String lowerCase = scan.nextLine();

            if (lowerCase == lowerCase.toLowerCase()) {
                String upperCase = lowerCase.toUpperCase();
                System.out.printf("Characters in Upper Case: %s", upperCase);
            } else if (lowerCase == lowerCase.toUpperCase()) {
                System.out.printf("Characters therefore: ");
                System.out.print(lowerCase.toLowerCase());
            }
        } catch (Exception e) {
            System.out.println("Exception Caught Here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
