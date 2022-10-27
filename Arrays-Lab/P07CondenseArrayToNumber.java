import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] condensedArr = new int[numberArr.length-1];
        int length = numberArr.length;
        int sum =0;

        for (int i = 0; i < length-1; i++) {
            sum = numberArr[i] + numberArr[i+1];

            condensedArr [i] = sum;

            if (length == 2) {
                System.out.println(sum);

                break;
            }
            if (i == length-1-1) {
                numberArr = condensedArr;
                length-=1;
                i = -1;
            }

        }

        if (numberArr.length == 1) {
            System.out.println(numberArr[0]);
        }

    }
}
