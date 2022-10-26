import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int digit = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            digit = i;
            while (digit > 0) {
                sum += digit % 10;
                digit = digit / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }


        }
    }
}
