import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        boolean same = true;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++)
                if (s1.charAt(i) != s2.charAt(i)) same = false;
        } else same = false;
        System.out.println("charAt match: " + same);
        System.out.println("equals match: " + s1.equals(s2));
    }
}
