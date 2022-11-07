// Program to reverse given input number

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int rev = 0, n;
        while (number != 0) {           //1546      154     15      1
            n = number % 10;            //6         4       5       1
            rev = rev * 10 + n;         //6         64      645     6451
            number = number / 10;       //154       15      1       0
        }
        System.out.printf("The reversed number is %d", rev);
    }
}
