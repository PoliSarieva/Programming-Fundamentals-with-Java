import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String inputLower = input.toLowerCase();
        printVowelsCount(inputLower);
    }

    public static void printVowelsCount (String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            switch (letter) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                case 'y':
                    count++;
                    break;
            }

        }
        System.out.println(count);
    }
    }

