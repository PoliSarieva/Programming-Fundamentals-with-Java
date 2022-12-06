import java.util.Scanner;

public class CarePuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFood = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int boughtFoodGrams = boughtFood * 1000;
        int eatedfood = 0;

        while (!input.equals("Adopted")) {
            int eatFood = Integer.parseInt(input);
            eatedfood += eatFood;

            input = scanner.nextLine();
        }

        int food = Math.abs(boughtFoodGrams - eatedfood);
        if (boughtFoodGrams >= eatedfood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", food);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", food);
        }
    }
}
