import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        middleCharacter(input);
    }
    public static void middleCharacter (String text) {

        if (text.length() % 2 == 1) {
            int middleChar = text.length() / 2;
            System.out.println(text.charAt(middleChar));
        } else {
            int firstMiddleChar = text.length() / 2 - 1;
            int secondMiddleChar = text.length() / 2;
            System.out.print(text.charAt(firstMiddleChar));
            System.out.print(text.charAt(secondMiddleChar));
        }
    }
}
