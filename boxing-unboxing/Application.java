// Program to demonstrate boxing - unboxing operation
public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to Boxing");
        int a = 20;
        Integer b = new Integer(a);   //Boxing is int to Integer i.e. small to big
        Integer c = 3;
        System.out.println(b + " " + c);
    }
}
