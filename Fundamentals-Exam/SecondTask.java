import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();

            String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);

            String product = "";
            boolean contanedDigit = false;
            boolean validBarcode = false;
            while (matcher.find()) {
                validBarcode = true;
                for (int charCount = 0; charCount < barcode.length(); charCount++) {
                    char symbol = barcode.charAt(charCount);

                    if (symbol >= 48 && symbol<= 57) {
                        product = product + "" + symbol;
                        contanedDigit = true;
                    }
                }
                if (!contanedDigit) {
                    product = "00";
                }
                System.out.printf("Product group: %s%n", product);
            }

            if (!validBarcode) {
                System.out.println("Invalid barcode");
            }
        }
    }
}
