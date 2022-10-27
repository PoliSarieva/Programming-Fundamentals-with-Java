import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int topNumber = numberArr[0];
        int [] newArr = new int[numberArr.length];



        for (int i = 0; i < numberArr.length-1; i++) {
            for (int j = i; j < numberArr.length-1; j++) {

                if (numberArr[i] > numberArr[j + 1]) {
                    topNumber = numberArr[i];
                } else {
                    break;
                }

            }
            newArr [i] = topNumber;
        }

    }
}
