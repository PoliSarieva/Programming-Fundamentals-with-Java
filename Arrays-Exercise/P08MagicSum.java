import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int givenNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int firstIndex = 0; firstIndex < numbers.length; firstIndex++) {

            for (int secondIndex = firstIndex + 1; secondIndex <= numbers.length - 1; secondIndex++) {
                sum = numbers[firstIndex] + numbers[secondIndex];

                if (sum == givenNumber) {
                    System.out.println(numbers[firstIndex] + " " + numbers[secondIndex]);
                }
            }
        }
    }
}
