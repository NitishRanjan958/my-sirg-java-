/* write a program to print greate among three number */
public class greate_three_number {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 10;
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }
}
