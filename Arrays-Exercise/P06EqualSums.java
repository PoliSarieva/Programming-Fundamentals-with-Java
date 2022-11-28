import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        boolean found = false;
        for (int index = 0; index <= numbers.length - 1; index++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if (leftSum == rightSum) {
                System.out.println(index);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("no");
        }
    }
}
