import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        int playerWins = 0, compWins = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your choice: ");
            String player = sc.next();
            String comp = choices[(int)(Math.random() * 3)];
            System.out.println("Computer: " + comp);
            if (player.equals(comp)) System.out.println("Draw");
            else if (player.equals("rock") && comp.equals("scissors") ||
                    player.equals("paper") && comp.equals("rock") ||
                    player.equals("scissors") && comp.equals("paper")) {
                System.out.println("You win");
                playerWins++;
            } else {
                System.out.println("Computer wins");
                compWins++;
            }
        }
        System.out.println("Player wins: " + playerWins + ", Computer wins: " + compWins);
    }
}
