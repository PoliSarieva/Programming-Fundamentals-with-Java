import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder modifailedText = new StringBuilder(input);
        int strength = 0;
        for (int i = 0; i <= modifailedText.length() - 1; i++) {
            char symbol = modifailedText.charAt(i);
            if (symbol == '>') {
                strength += Integer.parseInt(modifailedText.charAt(i+1) + "");

            } else if (symbol != '>' && strength > 0) {
                modifailedText.deleteCharAt(i);
                strength--;
                i--;
            }
        }

        System.out.println(modifailedText);


    }
}
