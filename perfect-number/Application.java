//Program to display whether given input number is perfect or not
public class Application {
    public static void main(String[] args) {

        int a = 6;
        int sum = 1;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (a == sum) {
            System.out.println("The number is a perfect number");
        } else {
            System.out.println("The number is not a perfect number");
        }
    }
}
