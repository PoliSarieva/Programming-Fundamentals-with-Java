import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        LinkedHashMap<String, Double> productsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> quantityMap = new LinkedHashMap<>();

        while (!input.equals("buy") && !input.equals("Buy")) {
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);
            double totalPrice = price * quantity;

            if (!productsMap.containsKey(name)) {
                productsMap.put(name, totalPrice);
                quantityMap.put(name, quantity);
            } else {
                int totalQuantity = quantityMap.get(name);
                quantity += totalQuantity;
                totalPrice = price * quantity;
                productsMap.replace(name, totalPrice);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }

     }
}
