import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i <= numberArr.length-1; i++) {
            int currentNumber = numberArr[i];

            if (i == numberArr.length - 1) {
                System.out.println(numberArr[i] + " ");
                break;
            }

            boolean top = false;
            for (int j = i+1; j <= numberArr.length-1; j++) {

                if (currentNumber > numberArr[j]) {
                    top = true;
                } else {
                    top = false;
                    break;
                }
            }

            if (top) {
                System.out.print(currentNumber + " ");
            }
        }

    }
}
