import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scanner.nextLine());
        int [] peopleArr = new int [wagonCount];
        int sum = 0;

        for (int i = 0; i < wagonCount; i++) {
           // int [] peopleArr = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
           peopleArr[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < wagonCount; i++) {
            sum += peopleArr[i];
            System.out.print(peopleArr[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
