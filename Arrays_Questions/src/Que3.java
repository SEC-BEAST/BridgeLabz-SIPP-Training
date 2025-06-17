
import java.util.Scanner;

public class Que3 {

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        double var2 = (double)var1.nextInt();
        double var4 = var2 / 2.54;
        int var6 = (int)(var4 / 12.0);
        double var7 = var4 % 12.0;
        System.out.println("" + var6 + " " + var7);
    }
}
