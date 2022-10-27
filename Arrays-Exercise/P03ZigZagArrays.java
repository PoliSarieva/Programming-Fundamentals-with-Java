import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int [] firstArr = new int[lines];
        int [] secondArr = new  int[lines];

        for (int i = 1; i <= lines; i++) {
            int [] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


            if (i % 2 != 0) {
                    firstArr[i-1] = numberArr[0];
                    secondArr[i-1] = numberArr[1];

            } else {
                        secondArr[i-1] = numberArr[0];
                        firstArr[i-1] = numberArr[1];

            }

        }

        for (int number:firstArr) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number:secondArr) {
            System.out.print(number + " ");
        }

    }
}
