import java.util.Scanner;

// Program to display simple arithmetic operations
public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers for calculation: ");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        char input;
        double answer;
        System.out.println("Which Calculation do you want to Perform? \n '+':Addition \n '-': Subtraction \n '*': Multiplication \n '/': Division");
        input = scan.next().charAt(0);

        switch (input) {
            case '+' :
                answer = firstNum + secondNum;
                System.out.printf("The Addition is %f", answer);
                break;
            case '-' :
                answer = firstNum - secondNum;
                System.out.printf("The subtraction is %f", answer);
                break;
            case '*' :
                answer = firstNum * secondNum;
                System.out.printf("The Multiplication is %f", answer);
                break;
            case '/' :
                answer = firstNum / secondNum;
                System.out.printf("The Division is %f", answer);
                break;
            default:
                System.out.printf("Wrong Input");
                break;
        }
        scan.close();
    }
}
