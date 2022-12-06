import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballsPoint = Integer.parseInt(scanner.nextLine());

        double point = 0;
        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int blackCount = 0;
        int otherCount = 0;

        for (int i = 0; i < ballsPoint; i++) {
            String ballsColor = scanner.nextLine();

            if (ballsColor.equals("red")) {
                point += 5;
                redCount++;
            } else if (ballsColor.equals("orange")) {
                point += 10;
                orangeCount++;
            } else if (ballsColor.equals("yellow")) {
                point += 15;
                yellowCount++;
            } else if (ballsColor.equals("white")) {
             point +=20;
             whiteCount++;
            } else if (ballsColor.equals("black")) {
                point = Math.floor(point / 2);
                blackCount++;
            } else {
                otherCount++;
           }
        }

        System.out.printf("Total points: %.0f%n", point);
        System.out.printf("Red balls: %d%n", redCount);
        System.out.printf("Orange balls: %d%n", orangeCount);
        System.out.printf("Yellow balls: %d%n", yellowCount);
        System.out.printf("White balls: %d%n", whiteCount);
        System.out.printf("Other colors picked: %d%n", otherCount);
        System.out.printf("Divides from black balls: %d", blackCount);
    }
}
