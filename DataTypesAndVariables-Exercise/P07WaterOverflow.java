import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberLines = Integer.parseInt(scanner.nextLine());
        int capacityTank = 255;

        int sumQuantitiesWater = 0;
        int finalWater = 0;
        for (int i = 0; i < numberLines; i++) {
            int quantitiesWater = Integer.parseInt(scanner.nextLine());
            sumQuantitiesWater += quantitiesWater;

            if (sumQuantitiesWater > capacityTank) {
                System.out.println("Insufficient capacity!");
            }

                if (sumQuantitiesWater <= capacityTank) {
                    finalWater = sumQuantitiesWater;
                } else {
                    sumQuantitiesWater = finalWater;
                }
        }
            System.out.println(finalWater);
        }
    }

