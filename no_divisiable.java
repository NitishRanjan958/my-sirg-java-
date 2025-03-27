/* write a program to check whether a given number is divisiable by 2, 3 or 7 */
public class no_divisiable {
    public static void main(String[] args) {
        int x = 345;
        if (x % 2 != 0 && x % 3 != 0 && x % 5 != 0)
            System.out.println(x + " is not divisiable by 2, 3, 5");
        else
            System.out.println(x + " is divisiable by 2, 3, 5");
    }
}
