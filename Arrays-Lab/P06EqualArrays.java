import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArr = Arrays.stream(scanner.nextLine().split((" "))).mapToInt(Integer::parseInt).toArray();
        int [] secondArr = Arrays.stream(scanner.nextLine().split((" "))).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean isIdentical = false;

        for (int i = 0; i <= firstArr.length-1; i++) {
                if (firstArr[i] == secondArr[i]) {
                         sum += firstArr[i];
                         isIdentical = true;
                } else {
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    isIdentical = false;
                    i = firstArr.length - 1;
                    break;
                }
        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
