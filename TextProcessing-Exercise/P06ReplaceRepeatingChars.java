import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder textSequence  = new StringBuilder();

        /*for (char letter:input.toCharArray()) {

            if (textSequence.indexOf(letter + "") == -1) {
                textSequence.append(letter);
            }
        }*/

        textSequence.append(input.charAt(0));
        for (int i = 0; i < input.length() - 1; i++) {
            char symbol = input.charAt(i);
            char nextSymbol = input.charAt(i +1);

            if (symbol != nextSymbol) {
                textSequence.append(nextSymbol);
            }
        }

        System.out.println(textSequence);
    }
}
