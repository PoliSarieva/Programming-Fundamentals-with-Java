import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pound = Double.parseDouble(scanner.nextLine());;

        double onePound = 1.36;

        double dolars = pound * onePound;

        System.out.printf("%.3f", dolars);
    }
}
