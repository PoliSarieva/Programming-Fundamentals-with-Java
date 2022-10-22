import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        for (int i = 0; i < countOrders; i++) {
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsule = Integer.parseInt(scanner.nextLine());

            double priceCoffee = priceCapsule * days * countCapsule;
            totalPrice += priceCoffee;
            System.out.printf("The price for the coffee is: $%.2f%n", priceCoffee);

        }
        System.out.printf("Total: $%.2f", totalPrice);

    }
}
