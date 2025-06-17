import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] builtIn = text.split(" ");
        String[] manual = text.split(" ");  // Placeholder for custom logic
        System.out.println("Match: " + Arrays.equals(builtIn, manual));
    }
}
