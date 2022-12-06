import java.util.Scanner;

public class TheImitationGameTheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String  inputCommand = scanner.nextLine();

        StringBuilder changeMassage = new StringBuilder(message);
        while (!inputCommand.equals("Decode")) {
            //•	"Move {number of letters}":
            //o	Moves the first n letters to the back of the string
            //•	"Insert {index} {value}":
            //o	Inserts the given value before the given index in the string
            //•	"ChangeAll {substring} {replacement}":
            //o	Changes all occurrences of the given substring with the replacement text
            String command = inputCommand.split("\\|")[0];

            switch (command) {
                case "Move":
                    int numberLetters = Integer.parseInt(inputCommand.split("\\|")[1]);
                    String moveText = changeMassage.substring(0, numberLetters);
                    changeMassage.replace(0, numberLetters, "");
                    changeMassage.append(moveText);
                    message = changeMassage.toString();
                    //System.out.println(changeMassage);
                    break;

                case "Insert":
                    int index = Integer.parseInt(inputCommand.split("\\|")[1]);
                    String value = inputCommand.split("\\|")[2];
                    changeMassage.insert(index, value);
                    message = changeMassage.toString();
                    break;

                case "ChangeAll":
                    String substring = inputCommand.split("\\|")[1];
                    String replacement = inputCommand.split("\\|")[2];

                    message = message.replace(substring, replacement);
                    changeMassage = new StringBuilder(message);
            }

            inputCommand = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);
    }
}
