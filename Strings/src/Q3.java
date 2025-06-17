import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt(), end = sc.nextInt();
        String sub1 = "", sub2 = text.substring(start, end);
        for (int i = start; i < end; i++) sub1 += text.charAt(i);
        System.out.println("Match: " + sub1.equals(sub2));
    }
}
