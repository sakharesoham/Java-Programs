import java.util.Scanner;

public class ForApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to ForEach Loop");

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        for (int n : arr) {
            System.out.print(n);
        }

        System.out.println("\nWelcome to For Loop");
        System.out.println("Please enter a number: \nYou will get all number from 1.");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for (int j = 1; j <= input; j++) {
            System.out.print(j);
        }
    }
}
