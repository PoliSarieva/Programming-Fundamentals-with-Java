import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int sezonCount = Integer.parseInt(scanner.nextLine());
        int epizodCount = Integer.parseInt(scanner.nextLine());
        double epizodTime = Double.parseDouble(scanner.nextLine());

        double reklams = epizodTime * 20 / 100;
        double epizodWithReklams = epizodTime + reklams;
        double specialEpizode = sezonCount * 10;

        double totalTime = sezonCount * epizodCount * epizodWithReklams + specialEpizode;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", serial, Math.floor(totalTime));
    }
}
