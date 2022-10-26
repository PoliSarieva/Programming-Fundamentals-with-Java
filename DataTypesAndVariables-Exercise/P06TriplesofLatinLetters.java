import java.util.Scanner;

public class P06TriplesofLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char firstnumber = (char) ('a' + i);
                    char secondnumber = (char) ('a' + j);
                    char thirdnumber = (char) ('a' + k);

                    System.out.printf("%c%c%c%n",firstnumber, secondnumber, thirdnumber);
                }
            }

        }
    }
}
