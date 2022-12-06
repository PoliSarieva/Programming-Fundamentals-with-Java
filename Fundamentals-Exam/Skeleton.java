import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minControl = Integer.parseInt(scanner.nextLine());
        int secControl = Integer.parseInt(scanner.nextLine());
        double lengthUlei = Double.parseDouble(scanner.nextLine());
        int sec100m = Integer.parseInt(scanner.nextLine());

        int timeControl = minControl * 60 + secControl;
        double timeSlower = (lengthUlei / 120) * 2.5;
        double time = lengthUlei / 100 * sec100m;
        double totalTime = time - timeSlower;

        if (totalTime <= timeControl) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", totalTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", totalTime - timeControl);
        }
    }
}
