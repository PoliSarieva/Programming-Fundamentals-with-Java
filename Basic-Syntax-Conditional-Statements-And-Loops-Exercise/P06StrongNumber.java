import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int lastNumber = 0;

        int sumFactoriel = 0;
        int number = input;

        while (number > 0) {
            lastNumber = number % 10;
            int factoriel = 1;

            for (int i = 1; i <= lastNumber ; i++) {
                factoriel *= i;
            }
            sumFactoriel += factoriel;

            number = number / 10;
        }

        if (sumFactoriel == input) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
