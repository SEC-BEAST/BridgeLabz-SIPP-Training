import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(), lower = "";
        for (char c : text.toCharArray())
            lower += (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
        System.out.println("Match: " + lower.equals(text.toLowerCase()));
    }
}
