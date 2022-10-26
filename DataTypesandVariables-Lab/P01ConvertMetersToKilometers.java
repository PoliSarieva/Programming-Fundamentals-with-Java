import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meter = Integer.parseInt(scanner.nextLine());
        double kilometer = meter * 0.1 / 100;

        System.out.printf("%.2f",kilometer);
    }
}
