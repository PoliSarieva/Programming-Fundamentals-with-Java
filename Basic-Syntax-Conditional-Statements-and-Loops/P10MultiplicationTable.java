import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int product = 1;

        for (int i = 1; i <= 10; i++) {
            product = number * i;
            System.out.printf("%d X %d = %d%n", number, i, product);
        }
    }
}
