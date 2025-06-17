import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
            System.out.println("Age: " + age[i] + " Can vote: " + (age[i] >= 18));
        }
    }
}
