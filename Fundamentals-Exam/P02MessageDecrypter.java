import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMessage = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countMessage; i++) {
            String message = scanner.nextLine();

            String regex = "^(\\$|\\%)(?<name>[A-Z][a-z]{2,})\\1(?<symbol>\\:\\s)(((?<number1>\\[[\\d]+\\])\\|)((?<number2>\\[[\\d]+\\])\\|)((?<number3>\\[[\\d]+\\])\\|))$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(message);

            boolean isValid = false;
            while (matcher.find()) {
                isValid = true;
                String number1 = matcher.group("number1");
                String number2 = matcher.group("number2");
                String number3 = matcher.group("number3");

                number1 = number1.replaceAll("\\[", "");
                number1 = number1.replaceAll("\\]", "");

                number2 = number2.replaceAll("\\[", "");
                number2 = number2.replaceAll("\\]", "");

                number3 = number3.replaceAll("\\[", "");
                number3 = number3.replaceAll("\\]", "");

                int numberOne = Integer.parseInt(number1);
                int numberTwo = Integer.parseInt(number2);
                int numberThird = Integer.parseInt(number3);

                char letter1 = (char)numberOne;
                char letter2 = (char)numberTwo;
                char letter3 = (char)numberThird;

                String name = matcher.group("name");
                String symbol = matcher.group("symbol");

                //Request: Isi
                System.out.println(name + symbol + "" + letter1 + letter2 + letter3);
            }

            if (!isValid) {
                System.out.println("Valid message not found!");
            }
            String text = "Java";
            System.out.println("I love" + text);
        }
    }
}
