// Programs to demonstrate primitive data types

public class Application {
    public static void main(String[] args) {
        int num = 10;                   //-2147483648 to 2147483647
        double d = 2.6e4;                 //4.9E-324 to 1.7976931348623157E+308
        byte b = 1;                     //-128 to 127
        short s = 15;                   //-32768 to 32767
        long number = 20000;            //-9223372036854775808 to 9223372036854775807
        float value = 1.5f;             //1.4E-45 to 3.4028235E+38
        char c = 's';                   //used for single character value
        boolean answer = true;          //stores either true or false
        String word = "Hello";          //holds string of characters
        System.out.printf(" Integer: %d\n Double: %f\n Byte: %d\n Short: %d\n Long: %d\n Float: %f\n Char: %c\n Boolean: %b\n String: %s\n", num, d, b, s, number, value, c, answer, word);

    }
}
