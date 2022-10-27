import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numberArr = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotation; i++) {
            String lastNumber = numberArr[0];
            for (int j = 0; j < numberArr.length-1; j++) {
            numberArr[j] = numberArr[j + 1];
            }
            numberArr[numberArr.length - 1] = lastNumber;
        }

        System.out.println(String.join(" ",numberArr));
    }
}
