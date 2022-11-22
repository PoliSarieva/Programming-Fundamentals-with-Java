import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!?(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> furniture = new ArrayList<>();
        double sumPrice = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("name");
                Double furniturePrice = Double.parseDouble(matcher.group("price"));
                int furnitureQuantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                double totalPrice = furniturePrice * furnitureQuantity;
                sumPrice += totalPrice;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String index:furniture) {
            System.out.println(index);
        }
        System.out.printf("Total money spend: %.2f", sumPrice);

    }
}
