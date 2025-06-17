import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        String trimmed = "";
        for (int i = start; i <= end; i++) trimmed += s.charAt(i);
        System.out.println("Manual Trim: '" + trimmed + "'");
        System.out.println("Built-in Trim: '" + s.trim() + "'");
    }
}
