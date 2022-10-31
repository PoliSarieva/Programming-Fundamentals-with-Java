import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int add = addNumber(firstNumber, secondNumber);
        int result = sutractNumber(add, thirdNumber);

        System.out.println(result);
    }
    public static int addNumber (int first, int second) {
        return first+second;
    }

    public static int sutractNumber (int first, int second) {
        return first - second;
    }
}
