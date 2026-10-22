import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 5;
        int computer = (int)Math.round(Math.random()*(max-min)) + min;
        System.out.print("Enter random number -> 1/10: ");
        int guessNumber = scanner.nextInt();
        if (guessNumber == computer) {
            System.out.println("You Win ! The winner takes it all");
        } else {
            System.out.println("Sorry :( You lose...");
        }
    }
}
