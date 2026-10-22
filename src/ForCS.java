import java.util.Scanner;

public class ForCS {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Yig'indi: " + sum);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kriting: ");
        int son = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(son * i);
        }

        for (int i = 1; i <= son; i++) {
            System.out.println(i*i);
        }
    }
}
