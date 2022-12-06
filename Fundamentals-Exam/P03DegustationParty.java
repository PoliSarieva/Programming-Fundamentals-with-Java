import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap <String, ArrayList<String>> guestMeal = new LinkedHashMap<>();

        int count = 0;
        while (!input.equals("Stop")) {
            //Like-{guest}-{meal}
            String command = input.split("-")[0];
            String guest = input.split("-")[1];
            String meal = input.split("-")[2];

            switch (command) {
                case "Like":
                    if (!guestMeal.containsKey(guest)) {
                        guestMeal.put(guest, new ArrayList<>());
                    }

                    if (!guestMeal.get(guest).contains(meal)) {
                        guestMeal.get(guest).add(meal);
                    }
                    break;

                case "Dislike":
                    if (guestMeal.containsKey(guest)) {
                        if (guestMeal.get(guest).contains(meal)) {
                            count += 1;
                            guestMeal.get(guest).remove(meal);
                            System.out.printf("%s doesn't like the %s.%n", guest, meal);
                        } else {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                        }
                    } else {
                        System.out.printf("%s is not at the party.%n", guest);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        //for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
        //            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        //        }

        for (Map.Entry<String, ArrayList<String>> entry : guestMeal.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(),String.join(", ", entry.getValue()));
        }

        System.out.printf("Unliked meals: %d", count);
    }
}
