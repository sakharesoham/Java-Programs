// Program to convert temperate from farenhite to celcius
// Input: Provide Temperature value in Fahrenheit

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.printf("Please enter the Temperature Value in Fahrenheit:");
            int fTemp = scan.nextInt();

            int cTemp = (fTemp - 32) * 5 / 9;
            System.out.printf("The temperature in Celcius is %d: ", cTemp);
        } catch (Exception e) {
            System.out.println("Exception caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
