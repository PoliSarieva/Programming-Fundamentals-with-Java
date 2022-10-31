import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            isPalendrome(input);

            input = scanner.nextLine();
        }

    }

    public static void isPalendrome (String number) {
        boolean isPalenrome = true;
        for (int i = 0; i < number.length(); i++) {
           if (number.charAt(i) != number.charAt(number.length() - 1 -i)) {
               isPalenrome = false;
               break;
           }
        }
        System.out.println(isPalenrome);
    }
}
