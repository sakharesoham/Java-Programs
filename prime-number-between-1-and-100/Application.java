// Prime number between 1 and 100
// Explain the program
public class Application {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            int p = num / 2;
            for (int i = 2; i < p; i++) {
                if (num % i == 0) {
                    return false;

                }
            }
        }
        return true;
    }
}