// Program to display fibonacci series upto given input value
public class Application {
    public static void main(String[] args) {
        int firstNum = 0, secondNum = 1, nextNum, n = 10;

        for (int i = 0; i <= n; i++) {                  //0 1 1 2 3 5
            System.out.println(firstNum + " ");

            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
