import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (char symbol:input.toCharArray()) {
            char encript = (char)((int) symbol + 3);
            encryptedText.append(encript);
        }

        System.out.println(encryptedText);
    }
}
