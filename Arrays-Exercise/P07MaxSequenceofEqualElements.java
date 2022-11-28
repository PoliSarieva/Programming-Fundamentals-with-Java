import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int element = 0;
        int count = 0;
        int currentCount = 0;

        for (int index = 0; index < numbers.length - 1; index++) {

            if (numbers[index] == numbers[index + 1]) {
                currentCount++;
            } else {
                currentCount = 0;
            }

            if (currentCount > count) {
                count = currentCount;
                element = numbers[index];
            }
        }

        for (int i = 0; i <= count; i++) {
            System.out.print(element + " ");
        }
    }
}
