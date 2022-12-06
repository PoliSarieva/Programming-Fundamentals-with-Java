import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String inputCommand = scanner.nextLine();

        StringBuilder newPassword = new StringBuilder();
        while (!inputCommand.equals("Done")) {
            String command = inputCommand.split(" ")[0];

            switch (command) {
                case "TakeOdd":
                    for (int i = 0; i < password.length(); i++) {
                        char symbol = password.charAt(i);
                        if (i % 2 != 0) {
                            newPassword.append(symbol);
                        }
                    }
                    password = newPassword.toString();
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(inputCommand.split(" ")[1]);
                    int length = Integer.parseInt(inputCommand.split(" ")[2]);

                        String cutText = password.substring(index, index + length);
                        password = password.replaceFirst(cutText, "");


                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = inputCommand.split(" ")[1];
                    String substitute = inputCommand.split(" ")[2];

                    boolean isContain = false;

                    while (password.contains(substring)) {
                        isContain = true;
                        password = password.replace(substring, substitute);
                    }

                    if (isContain) {
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }

            inputCommand = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }
}
