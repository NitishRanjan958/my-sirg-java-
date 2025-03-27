/*write a program to swap values of two int variables. */
public class HelloWorld {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a=" + a + " b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
    }
}