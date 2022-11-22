import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        String regexName = "([A-Za-z])";
        Pattern pattern = Pattern.compile(regexName);

        String regexDigit = "\\d";
        Pattern pattern1 = Pattern.compile(regexDigit);

        HashMap<String, Integer> participantsMap = new HashMap<>();

        for (String parts:participants) {
            participantsMap.put(parts, 0);
        }

        while (!input.equals("end of race")) {
        Matcher matcher = pattern.matcher(input);
        Matcher matcher1 = pattern1.matcher(input);

            StringBuilder nameSB = new StringBuilder();
            int distance = 0;

            while (matcher.find()) {
                String name = matcher.group();
                nameSB.append(name);
            }

            while (matcher1.find()) {
                String digitText = matcher1.group();
                int digit = Integer.parseInt(digitText);
                distance += digit;
            }

            if (participantsMap.containsKey(nameSB.toString())) {
                distance += participantsMap.get(nameSB.toString());
                participantsMap.put(nameSB.toString(), distance);
            }

            input = scanner.nextLine();
        }

        List<String> first3thPlace = participantsMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("1st place: " + first3thPlace.get(0));
        System.out.println("2nd place: " + first3thPlace.get(1));
        System.out.println("3rd place: " + first3thPlace.get(2));
    }
}
