import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (!passwordLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!passwordConsist(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!consistTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (passwordLength(password) && passwordConsist(password) && consistTwoDigits(password)) {
            System.out.println("Password is valid");
        }

        }


    public static boolean passwordLength (String pass) {

        if (pass.length() >= 6 && pass.length() < 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean passwordConsist (String pass) {

        for (char symbol:pass.toCharArray()) {

            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
       return true;
    }

    public static boolean consistTwoDigits (String pass) {
        int count = 0;
        for (char symbol:pass.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
