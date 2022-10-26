import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCoint = Integer.parseInt(scanner.nextLine());
        long digit = 0;

        for (int i = 0; i < lineCoint; i++) {
            //int numberOne = Integer.parseInt(scanner.next());
            //int numberTwo = Integer.parseInt(scanner.next());
            long numberOne = Long.parseLong(scanner.next());
            long numberTwo = Long.parseLong(scanner.next());

            int sum = 0;
            if (numberOne >= numberTwo) {

                while (numberOne>0) {
                    digit = numberOne % 10;
                    numberOne = numberOne / 10;
                    sum += digit;
                }

            } else {

                while (numberTwo>0) {
                    digit = numberTwo % 10;
                    numberTwo = numberTwo / 10;
                    sum += digit;
                }

            }

            System.out.println(sum);
        }
    }
}
