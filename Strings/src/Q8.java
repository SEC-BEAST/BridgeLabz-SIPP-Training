import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(), upper = "";
        for (char c : text.toCharArray())
            upper += (c >= 'a' && c <= 'z') ? (char)(c - 32) : c;
        System.out.println("Match: " + upper.equals(text.toUpperCase()));
    }
}
