import java.util.Arrays;
import java.util.Scanner;

public class P05EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numberArr.length; i++) {
            int number = numberArr[i];

            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        int difference = sumEven - sumOdd;
        System.out.println(difference);
    }
}
