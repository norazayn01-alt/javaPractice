import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int userInt;
        do {
            System.out.print("Itni nechta oyogi bor? : ");
            Scanner scanner = new Scanner(System.in);
            userInt = scanner.nextInt();
            if (userInt == 4){
                System.out.println("Siz to'g'ri aytdingiz");
            } else {
                System.out.println("Siz xato aytdingiz");
            }
        } while (userInt != 4);
    }
}
