import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int afterMinutes = minutes + 30;

        if (afterMinutes > 60) {
            hours = hours + 1;
            minutes = afterMinutes - 60;
        } else {
            minutes = afterMinutes;
        }

        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);

    }
}
