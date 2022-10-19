import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int product = 1;

        for (int i = secondNumber; i <= 10; i++) {
            product = number * i;
            System.out.printf("%d X %d = %d%n", number, i, product);
        }

        if (secondNumber > 10) {
            product = number * secondNumber;
            System.out.printf("%d X %d = %d%n", number, secondNumber, product);
        }
    }
}
