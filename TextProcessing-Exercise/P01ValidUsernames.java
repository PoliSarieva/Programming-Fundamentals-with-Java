import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (int i = 0; i < input.length; i++) {
            String userName = input[i];

            if (isValidLength(userName) && isValidContains(userName)) {
                System.out.println(userName);
            }


        }
    }

    public static boolean isValidLength (String name) {
        int lengthName = name.length();
        if (lengthName > 3 && lengthName < 16) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidContains (String name) {
        for (int i = 0; i < name.length(); i++) {
            char symbol = name.charAt(i);

            if (!Character.isLetterOrDigit(symbol) && symbol!= '-' && symbol != '_' ) {
                return false;
            }
        }
        return  true;
    }
}
