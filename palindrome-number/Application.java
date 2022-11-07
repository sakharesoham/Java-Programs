// Program to display whether given input number is palindrome or not
public class Application {
    public static void main(String[] args) {
        int num = 1661, reverse = 0, remainder;
        int OgNum = num;
        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        if (OgNum == reverse) {
            System.out.println("It is Palindrome.");
        } else {
            System.out.println("It is not Palindrome.");
        }
    }
}
