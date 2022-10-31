import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {

            if (isDivisibleEight(number) && oddDigit(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isDivisibleEight(int number) {

            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            return sum % 8 == 0;
    }

    public static boolean oddDigit (int number) {
            while (number > 0) {
                int digit = number % 10;

                if (digit % 2 != 0) {
                    return true;
                } else {
                    number /= 10;
                }
            }

            return false;
    }
}
