import java.util.Scanner;

// Program to read a grade and display its equivalent description
public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to School Results");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter grade of your Pupil: A B C D E or F");
            char grade = scan.next().charAt(0);

            if (grade == 'A') {
                System.out.println("You scored more than 80%");
            } else if (grade == 'B') {
                System.out.println("You scored more than 70% but less than 80%");
            } else if (grade == 'C') {
                System.out.println("You scored more than 60% but less than 70%");
            } else if (grade == 'D') {
                System.out.println("You scored more than 50% but less than 60%");
            } else if (grade == 'E') {
                System.out.println("You scored more than 40% but less than 50% ");
            } else if (grade == 'F') {
                System.out.println("You Failed");
            } else
                System.out.println("Invalid Input");
        } catch (Exception e) {
            System.out.println("Exception Caught here " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
