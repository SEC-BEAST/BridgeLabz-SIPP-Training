import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] manual = new char[text.length()];
        for (int i = 0; i < text.length(); i++) manual[i] = text.charAt(i);
        char[] builtin = text.toCharArray();
        boolean match = true;
        for (int i = 0; i < text.length(); i++)
            if (manual[i] != builtin[i]) match = false;
        System.out.println("Arrays match: " + match);
    }
}
