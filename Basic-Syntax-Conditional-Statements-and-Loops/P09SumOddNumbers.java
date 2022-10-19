import java.util.Scanner;

public class P09SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int number = 1;
        int sum = 0;

        while (count < countNumber) {
            System.out.println(number);
            sum = sum + number;
            count++;
            number = number + 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
