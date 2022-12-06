import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String inputCommand = scanner.nextLine();

       // StringBuilder activationKey = new StringBuilder(rawActivationKey);
        while (!inputCommand.equals("Generate")) {
            String[] inputCommandArr = inputCommand.split(">>>");
            String command = inputCommandArr[0];

            switch (command) {
                case "Contains":
                    String substring = inputCommandArr[1];

                    if (activationKey.contains(substring)){
                        System.out.printf("%s contains %s", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }

                    break;
                case "Flip":
                    String upperLower = inputCommandArr[1];
                    int startIndex = Integer.parseInt(inputCommandArr[2]);
                    int endIndex = Integer.parseInt(inputCommandArr[3]);

                    String changeText = activationKey.substring(startIndex, endIndex);
                    if (upperLower.equals("Upper")) {
                        activationKey = activationKey.replace(changeText, changeText.toUpperCase());


                    } else if (upperLower.equals("Lower")) {
                        activationKey = activationKey.replace(changeText, changeText.toLowerCase());
                    }

                    System.out.println(activationKey);
                    break;
                case "Slice":

                    int startIndexSlice = Integer.parseInt(inputCommandArr[1]);
                    int endIndexSlice = Integer.parseInt(inputCommandArr[2]);

                    String deleteText = activationKey.substring(startIndexSlice, endIndexSlice);
                    activationKey = activationKey.replace(deleteText, "");
                    System.out.println(activationKey);
                    break;
            }

            inputCommand = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", activationKey);
    }
}
