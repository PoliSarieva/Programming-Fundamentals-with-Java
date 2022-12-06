import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(#|\\|)(?<name>[A-Za-z\\s]+)\\1(?<date>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(?<calories>[\\d]{0,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        //LinkedHashMap<String, String> nameDateMap = new LinkedHashMap<>();
        //LinkedHashMap <String, Integer> nameCalMap = new LinkedHashMap<>();
        StringBuilder output = new StringBuilder();

        int totalCalories = 0;
        while (matcher.find()) {
            String name = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            //nameDateMap.put(name, date);
            //nameCalMap.put(name, calories);

            output.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", name, date, calories));

            totalCalories += calories;
        }

        int countDays = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", countDays);

       /* for (Map.Entry<String, String> entry : nameDateMap.entrySet()) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", entry.getKey(), entry.getValue(), nameCalMap.get(entry.getKey()));
        }*/

        System.out.println(output);
    }
}
