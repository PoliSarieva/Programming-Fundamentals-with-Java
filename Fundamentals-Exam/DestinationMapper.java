import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(=|\\/)[A-Z][A-Za-z]{3,}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinationList = new ArrayList<>();
        int point = 0;
        while (matcher.find()) {
            String destination = matcher.group();
            destinationList.add(destination);
            point += destination.length();
        }

        for (String destin:destinationList) {
            System.out.println();
        }
    }
}
