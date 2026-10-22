import java.util.Scanner;

public class CS {
    public static void main(String[] args) {
        System.out.println("Telegram");
        System.out.println("You will have simple emojis");
        System.out.println("Is your telegram premium? (Yes/No -> 0/1): ");
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        if (userInt == 0) {
            System.out.println("Yes, You have Telegram Premium!");
        } else {
            System.out.println("No, you haven't Telegram Premium!");
        }

        System.out.print("Yoshingizni kiriting: ");
        Scanner scanner1 = new Scanner(System.in);
        int age = scanner1.nextInt();

        if (age > 50) {
            System.out.println("Siz nafaqa yoshiga yetgansiz !");
        } else if ( age > 40) {
            System.out.println("Siz nafaqa yoshiga yetmagansiz !");
        } else if (age > 30) {
            System.out.println("Siz o'rta yoshsiz");
        } else {
            System.out.println("Yoshsiz!");
        }
    }
}
