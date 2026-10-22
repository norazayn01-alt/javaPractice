import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Asosni kiriting: ");
        int base = scanner.nextInt();
        System.out.print("Daraja sonini kiriting: ");
        int k = scanner.nextInt();

        int resPow = 1;
        for (int i = 0; i < k; i++) {
            resPow *= base;
        }
        System.out.println(resPow);
    }
}
