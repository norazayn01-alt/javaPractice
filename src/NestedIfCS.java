import java.util.Scanner;

public class NestedIfCS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your gender (Male/Famale -> 0/1: ");
        int gender = scanner.nextInt();

        System.out.print("Your age: ");
        int age = scanner.nextInt();

        if (gender == 0) {
            System.out.println("You are man");
        }
    }
}
