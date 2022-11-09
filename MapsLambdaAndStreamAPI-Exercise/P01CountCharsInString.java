import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        LinkedHashMap<Character, Integer> textMap = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (!textMap.containsKey(letter)) {
                textMap.put(letter, 0);
            }

            int value = textMap.get(letter);
            textMap.put(letter, value+1);
        }

        for (Map.Entry<Character, Integer> entry : textMap.entrySet()) {
            System.out.printf(" %s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
