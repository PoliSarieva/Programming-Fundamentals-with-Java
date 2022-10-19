import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        boolean isValid = true;

        if (day.equals("Weekday")) {
            if (age <= 18 && age >=0) {
                price = 12;
            }

            if (age > 18 && age <=64) {
                price = 18;
            }

            if (age > 64 && age <= 122) {
                price = 12;
            }
        } else if (day.equals("Weekend")) {
            if (age <= 18 && age >=0) {
                price = 15;
            }

            if (age > 18 && age <=64) {
                price = 20;
            }

            if (age > 64 && age <= 122) {
                price = 15;
            }
        } else if (day.equals("Holiday")) {
            if (age <= 18 && age >=0) {
                price = 5;
            }

            if (age > 18 && age <=64) {
                price = 12;
            }

            if (age > 64 && age <= 122) {
                price = 10;
            }
        }

        if (price != 0) {
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }
    }
}
