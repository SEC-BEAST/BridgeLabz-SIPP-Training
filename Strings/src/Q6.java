import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        try {
            System.out.println(str.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e);
        }
    }
}
