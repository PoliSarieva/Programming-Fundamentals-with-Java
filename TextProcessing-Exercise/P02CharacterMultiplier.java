import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        String firstArr = input[0];
        String secondArr = input[1];

        characterSums(firstArr, secondArr);
    }

    public static void characterSums (String firstArr, String secondArr) {
        int sum = 0;
        int length = Math.min(firstArr.length(), secondArr.length());

        for (int i = 0; i < length; i++) {
            char symbolFirstArr = firstArr.charAt(i);
            char symbolSecondArr = secondArr.charAt(i);

            int multiply = symbolFirstArr * symbolSecondArr;
            sum += multiply;
        }

        if (firstArr.length() > secondArr.length()) {
            int rezult = firstArr.length() - secondArr.length();
            int start = secondArr.length();
            int stop = start + rezult;

            for (int i = start; i < stop; i++) {
                sum += firstArr.charAt(i);
            }
        } else {
            int rezult = secondArr.length() - firstArr.length();
            int start = firstArr.length();
            int stop = start + rezult;

            for (int i = start; i < stop; i++) {
                sum += secondArr.charAt(i);
            }


        }

        System.out.println(sum);
    }
}
