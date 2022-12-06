import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThirthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plantsCount = Integer.parseInt(scanner.nextLine());

        HashMap<String, Integer> plantList = new HashMap<>();
        HashMap <String, Double> plantRatingMap = new HashMap<>();

        String plantInfo = scanner.nextLine();
        for (int i = 0; i < plantsCount; i++) {
            String plant = plantInfo.split("<->")[0];
            int rarity = Integer.parseInt(plantInfo.split("<->")[1]);

            plantRatingMap.put(plant, 0.0);

            if (!plantList.containsKey(plant)) {
                plantList.put(plant, 0);
            }
            plantList.put(plant, rarity);


            plantInfo = scanner.nextLine();
        }

        while (!plantInfo.equals("Exhibition")) {
            //Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)
            //•	"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one
            //•	"Reset: {plant}" – remove all the ratings of the given plant
            String[] plantsActualization = plantInfo.split(":");
            String command = plantsActualization[0];
            String plantRating = plantsActualization[1];
            String plant = plantRating.split(" - ")[0];

            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(plantRating.split(" - ")[1]);

                   //double valuePlant = plantRatingMap.get(plant);
                    if (plantRatingMap.get(plant) == 0) {
                        plantRatingMap.put(plant, rating);
                    } else {
                        double currentRating = plantRatingMap.get(plant);
                        plantRatingMap.put(plant, (currentRating + rating) /2);
                    }
                    break;
                case "Update":
                    int newRarity = Integer.parseInt(plantRating.split(" - ")[1]);

                    plantList.put(plant, newRarity);
                    break;
                case "Reset":
                    plantRatingMap.put(plant, 0.0);
                    break;
            }

            plantInfo = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : plantList.entrySet()) {
                System.out.printf("- %s; Rarity: %d; Rating: %.2f", entry.getKey(), entry.getValue(),plantRatingMap.get(entry.getKey()));
        }

    }
}
