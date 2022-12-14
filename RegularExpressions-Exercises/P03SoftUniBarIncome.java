import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "\\%(?<customer>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[\\d]+)\\|[^|$%.]*?(?<price>[\\d]+\\.?[\\d]*)\\$";
        Pattern pattern = Pattern.compile(regex);


        double finalyPrice = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            double totalPrice = 0;
            while (matcher.find()) {
                String name = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                totalPrice = count * price;

                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);
            }
            finalyPrice += totalPrice;

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", finalyPrice);
    }
}
