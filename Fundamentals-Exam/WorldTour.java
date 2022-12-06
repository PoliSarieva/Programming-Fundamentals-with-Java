import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputDestination = scanner.nextLine();

        StringBuilder changeDestination = new StringBuilder(inputDestination);
        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("Travel")) {
            //Add Stop:{index}:{string}":
            //o	Insert the given string at that index only if the index is valid
            //•	"Remove Stop:{start_index}:{end_index}":
            //o	Remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
            //•	"Switch:{old_string}:{new_string}":
            //o	If the old string is in the initial string, replace it with the new one (all occurrences)
            String command = inputCommand.split(":")[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(inputCommand.split(":")[1]);
                    String destination = inputCommand.split(":")[2];

                    if (index >= 0 && index < inputDestination.length()) {
                    changeDestination.insert(index, destination);
                    inputDestination = changeDestination.toString();
                    System.out.println(inputDestination);
            }
                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(inputCommand.split(":")[1]);
                    int endIndex = Integer.parseInt(inputCommand.split(":")[2]);

                    if (startIndex >= 0 && startIndex < inputDestination.length() && endIndex>=0 && endIndex<inputDestination.length()) {
                        changeDestination.replace(startIndex, endIndex + 1, "");
                        inputDestination = changeDestination.toString();
                        System.out.println(inputDestination);
                    }
                    break;

                case "Switch":
                    String oldDestination = inputCommand.split(":")[1];
                    String newDestination = inputCommand.split(":")[2];

                    if (inputDestination.contains(oldDestination)) {
                       inputDestination = inputDestination.replaceAll(oldDestination, newDestination);
                       changeDestination = new StringBuilder(inputDestination);
                    }
                    System.out.println(changeDestination);
                    break;
            }



            inputCommand = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", inputDestination);
    }
}
