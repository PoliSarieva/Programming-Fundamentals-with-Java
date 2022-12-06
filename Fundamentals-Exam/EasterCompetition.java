import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeCount = Integer.parseInt(scanner.nextLine());
        int maxPoint = Integer.MIN_VALUE;
        String name = "";

        for (int i = 0; i < cakeCount; i++) {

            String namebaker = scanner.nextLine();
            String input = scanner.nextLine();
            int sumPoint = 0;
            while (!input.equals("Stop")) {
                int exam = Integer.parseInt(input);
                sumPoint += exam;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", namebaker, sumPoint);

            if (sumPoint > maxPoint) {
                name = namebaker;
                maxPoint = sumPoint;
                System.out.printf("%s is the new number 1!%n", namebaker);
            }
        }

        System.out.printf("%s won competition with %d points!", name, maxPoint);
    }
}
