import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String inputCommand = scanner.nextLine();

        //•	"swap {index1} {index2}" takes two elements and swap their places.
        //•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index.
        // Save the product at the 1st index.
        //•	"decrease" decreases all elements in the array with 1.

        while (!inputCommand.equals("end")) {
            String command = inputCommand.split(" ")[0];

            switch (command) {
                case "swap":
                    int index1 = Integer.parseInt(inputCommand.split(" ")[1]);
                    int index2 = Integer.parseInt(inputCommand.split(" ")[2]);

                    int firstElement = numbers[index1];
                    int secondElement = numbers[index2];

                    numbers[index1] = secondElement;
                    numbers[index2] = firstElement;
                    break;
                case "multiply":
                    int index1Multiply = Integer.parseInt(inputCommand.split(" ")[1]);
                    int index2Multiply = Integer.parseInt(inputCommand.split(" ")[2]);

                    int product = numbers[index1Multiply]*numbers[index2Multiply];

                    numbers[index1Multiply] = product;

                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }

                    break;
            }

            inputCommand = scanner.nextLine();
        }

        for (int i = 0; i <= numbers.length - 2; i++) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println(numbers[numbers.length-1]);
    }
}
