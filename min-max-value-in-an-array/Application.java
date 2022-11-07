// Program to find minimum and maximum value in an integer array

public class Application {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.printf("Maximum element:%d ", max);
        System.out.printf("Minimum element:%d ", min);
    }
}
