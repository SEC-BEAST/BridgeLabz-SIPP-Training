import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        String min = words[0], max = words[0];
        for (String word : words) {
            if (word.length() < min.length()) min = word;
            if (word.length() > max.length()) max = word;
        }
        System.out.println("Shortest: " + min + ", Longest: " + max);
    }
}
