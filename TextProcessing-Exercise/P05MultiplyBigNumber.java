import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNumber = Long.parseLong(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long product = firstNumber * secondNumber;
        System.out.println(product);
    }
}
