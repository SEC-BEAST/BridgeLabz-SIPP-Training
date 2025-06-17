import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) >= 0)
                    System.out.println(c + ": Vowel");
                else
                    System.out.println(c + ": Consonant");
            } else System.out.println(c + ": Not a letter");
        }
    }
}
