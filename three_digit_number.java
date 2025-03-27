/* write a program to check whether a given number is a three number or not */
public class three_digit_number {
    public static void main(String[] args) {
        int x = 345;
        if (x >= 100 && x <= 999)
            System.out.println(x + " is a three digit number");
        else
            System.out.println(x + " is not a three digit number");
    }
}
