import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallest(firstNumber, secondNumber, thirdNumber);
    }

    public static void printSmallest (int first,int second,int third) {
        if (first < second && first < third) {
            System.out.println(first);
        } else if (second < first && second < third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}
