import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumCoins = 0;
        double priceProduct = 0;
        double money = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            // 0.1, 0.2, 0.5, 1, and 2
            if (coins == 0.1) {
                sumCoins += coins;
            } else if (coins == 0.2) {
                sumCoins += coins;
            } else if (coins == 0.5) {
                sumCoins += coins;
            } else if (coins == 1) {
                sumCoins += coins;
            } else if (coins == 2) {
                sumCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String product = input;

            switch (product) {
                case "Nuts":
                    priceProduct = 2.0;
                    break;
                case "Water":
                    priceProduct = 0.7;
                    break;
                case "Crisps":
                    priceProduct = 1.5;
                    break;
                case "Soda":
                    priceProduct = 0.8;
                    break;
                case "Coke":
                    priceProduct = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
            }

            money = sumCoins - priceProduct;

            if (money < 0) {
                money = 0;
                System.out.println("Sorry, not enough money");
            } else if (money>= 0 && product.equals("Nuts") || product.equals("Water") ||
                    product.equals("Crisps") || product.equals("Soda") || product.equals("Coke")){
                sumCoins = money;
                System.out.printf("Purchased %s%n", product);
            } else {
                break;
            }

            input = scanner.nextLine();
        }

        if (sumCoins >= 0) {
            System.out.printf("Change: %.2f", sumCoins);
        }

    }

}
