import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            int n = Integer.parseInt(text);
            System.out.println("Number: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Caught: " + e);
        }
    }
}
