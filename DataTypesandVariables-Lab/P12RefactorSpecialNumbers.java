import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 0;
        boolean isSpecialNum = false;

        for (int  nextNumber= 1; nextNumber <= numberCount; nextNumber++) {
            number = nextNumber;

            while (nextNumber > 0) {
                sum += nextNumber % 10;
                nextNumber = nextNumber / 10;
            }

            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", number, isSpecialNum);
            sum = 0;
            nextNumber = number;


        }

    }
}
