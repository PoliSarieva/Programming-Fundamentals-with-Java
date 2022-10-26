import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (number >0){
            char letter = scanner.nextLine().charAt(0);
            number--;

            sum += letter;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
