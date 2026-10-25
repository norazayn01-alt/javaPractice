import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("N sonini kiriting: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long a = 0 , b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
    }
}
