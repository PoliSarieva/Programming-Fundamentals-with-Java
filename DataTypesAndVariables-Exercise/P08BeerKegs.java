import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countKegs = Integer.parseInt(scanner.nextLine());

        double volumeMin = Double.MIN_VALUE;
        String biggestKeg = "";
        for (int i = 0; i < countKegs; i++) {
            String keg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volumeKeg = Math.PI * Math.pow(radius, 2) * height;

            if (volumeKeg > volumeMin) {
                volumeMin = volumeKeg;
                biggestKeg = keg;
            }
        }

        System.out.println(biggestKeg);
    }
}
