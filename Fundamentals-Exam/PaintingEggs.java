import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – размер на яйцата – текст с възможности "Large", "Medium" или "Small"
        //•	Втори ред – цвят на яйцата – текст  с възможности "Red", "Green" или "Yellow"
        //•	Трети ред – брой партиди – цяло число в интервала [1… 350]
        String eggSize = scanner.nextLine();
        String eggColor = scanner.nextLine();
        int partidesCount = Integer.parseInt(scanner.nextLine());
        int eggPrice = 0;

        if (eggSize.equals("Large")) {
            if (eggColor.equals("Red")) {
                eggPrice = 16;
            } else if (eggColor.equals("Green")) {
                eggPrice = 12;
            } else if (eggColor.equals("Yellow")) {
                eggPrice = 9;
            }
        } else if (eggSize.equals("Medium")) {
            if (eggColor.equals("Red")) {
                eggPrice = 13;
            } else if (eggColor.equals("Green")) {
                eggPrice = 9;
            } else if (eggColor.equals("Yellow")) {
                eggPrice = 7;
            }
        } else if (eggSize.equals("Small")) {
            if (eggColor.equals("Red")) {
                eggPrice = 9;
            } else if (eggColor.equals("Green")) {
                eggPrice = 8;
            } else if (eggColor.equals("Yellow")) {
                eggPrice = 5;
            }
        }

        double price = partidesCount * eggPrice;
        double expenses = price * 35 / 100;
        double totalPrice = price - expenses;
        System.out.printf("%.2f leva.", totalPrice);
    }
}
