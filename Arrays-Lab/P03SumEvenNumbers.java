import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int number:numberArr) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
