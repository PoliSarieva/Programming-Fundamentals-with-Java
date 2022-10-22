import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String enterPassword = scanner.nextLine();

        String password = "";
        int count = 0;
        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            password += symbol;
        }

        while (!enterPassword.equals(password)) {

            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            enterPassword = scanner.nextLine();
        }

        if (enterPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
