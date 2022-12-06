import java.util.Scanner;

public class P01StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("End")) {
            String[] inputCommandArr = inputCommand.split("\\s+");
            String command = inputCommandArr[0];

            //Translate {char} {replacement}"
            //o	"Includes {substring}"
            //o	"Start {substring}"
            //o	"Lowercase"
            //o	"FindIndex {char}"
            //o	"Remove {startIndex} {count}"
            switch (command) {
                case "Translate":
                    char letter = inputCommandArr[1].charAt(0);
                    char replacement = inputCommandArr[2].charAt(0);

                    for (int i = 0; i < text.length(); i++) {
                        char currentLetter = text.charAt(i);
                        if (currentLetter == letter) {
                           text = text.replace(currentLetter, replacement);
                        }
                    }
                    System.out.println(text);
                    break;

                case "Includes":
                    String substringIncludes = inputCommandArr[1];

                    if (text.contains(substringIncludes))   {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;

                case "Start":
                    String substringStart = inputCommandArr[1];

                    if (text.startsWith(substringStart)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;

                case "Lowercase":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;

                case "FindIndex":
                    char findLetter = inputCommandArr[1].charAt(0);

                    int lastFind = 0;
                    for (int i = 0; i < text.length(); i++) {
                        char currentLetter = text.charAt(i);
                        if (currentLetter == findLetter) {
                            lastFind = i;
                        }
                    }
                    System.out.println(lastFind);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(inputCommandArr[1]);
                    int count = Integer.parseInt(inputCommandArr[2]);

                   String removeText = text.substring(startIndex, startIndex + count);
                    text = text.replace(removeText, "");
                    System.out.println(text);
                    break;
            }



            inputCommand = scanner.nextLine();
        }
    }
}
