import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        int countAttacked = 0;
        int countDestroyed = 0;



        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String decripted = decripted(input);

            String regex = "@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>[\\d]+)[^@!:>-]*!(?<atack>[AD])![^@!:>-]*->(?<soildierCount>[\\d]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decripted);

            while (matcher.find()) {
                String planet = matcher.group("planet");
                int population = Integer.parseInt(matcher.group("population"));
                String atack = matcher.group("atack");
                int soildierCount = Integer.parseInt(matcher.group("soildierCount"));

                if (atack.equals("A")) {
                    attackedPlanets.add(planet);
                    countAttacked++;
                } else {
                    destroyedPlanets.add(planet);
                    countDestroyed++;
                }
            }
        }

        System.out.println("Attacked planets: " + countAttacked);
        if (countAttacked != 0) {

            for (int i = attackedPlanets.size() - 1; i >= 0; i--) {
                System.out.printf("-> %s%n", attackedPlanets.get(i));
            }
        }

        System.out.println("Destroyed planets: " + countDestroyed);
        if (countDestroyed != 0) {
            for (int i = destroyedPlanets.size() - 1; i >= 0; i--) {
                System.out.printf("-> %s%n", destroyedPlanets.get(i));
            }
        }
    }

    public static String decripted (String encripted) {
        int decriptedCount = decriptedCount(encripted);
        int  count = decriptedCount(encripted);

        StringBuilder decriptedString = new StringBuilder();
        for (int i = 0; i < encripted.length(); i++) {
            char letterNew = (char) (encripted.charAt(i) - count);
            decriptedString.append(letterNew);
        }
        return decriptedString.toString();
    }

    public static int decriptedCount (String enripted) {

        int count = 0;
        for (int i = 0; i < enripted.length(); i++) {
            char letter = enripted.charAt(i);

            switch (letter) {
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                case 's':
                case 't':
                case 'a':
                case 'r':
                    count++;
                    break;
            }
        }
        return count;
    }




}
