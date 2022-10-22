import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.0;

        if (typeGroup.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
             price = 10.46;
            }
        } else if (typeGroup.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
        } else if (typeGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }

        double totalPrice = price * countPeople;


        if (typeGroup.equals("Students") && countPeople >= 30) {
            double discount = price * countPeople * 15 / 100;
            totalPrice = totalPrice - discount;
        }

        if (typeGroup.equals("Business") && countPeople >= 100) {
            totalPrice = (countPeople - 10) * price;
        }

        if (typeGroup.equals("Regular") && countPeople >= 10 && countPeople <=20) {
            double discount = countPeople * price * 5 /100;
            totalPrice = totalPrice - discount;
        }

        System.out.printf("Total price: %.2f",totalPrice);
    }
}
