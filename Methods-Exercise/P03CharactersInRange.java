import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbolOne = scanner.nextLine().charAt(0);
        char symbolTwo = scanner.nextLine().charAt(0);

        printCharacterInRange(symbolOne, symbolTwo);
    }

    public static void printCharacterInRange(char one, char two) {
        if (one < two) {
            for (int i = one + 1; i < two; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = two+1; i < one; i++) {
                System.out.print((char) i + " ");
            }
        }
    }

}