import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFactorial = factorial(firstNumber);
        long secondFactorial = factorial(secondNumber);

        double divided = firstFactorial * 1.0 / secondFactorial;
        System.out.printf("%.2f", divided);
    }

    public static long factorial (int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
