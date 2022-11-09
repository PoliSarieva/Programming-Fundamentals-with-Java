import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> nameLicenseMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String commands = scanner.nextLine();
            String command = commands.split(" ")[0];
            String name = commands.split(" ")[1];


            if (command.equals("register")) {
                String licenseNumber = commands.split(" ")[2];

                if (!nameLicenseMap.containsKey(name)) {
                    nameLicenseMap.put(name, licenseNumber);
                    System.out.printf("%s registered %s successfully%n", name, licenseNumber);
                } else {
                    String currentLicenseNumber = nameLicenseMap.get(name);
                    System.out.printf("ERROR: already registered with plate number %s%n", currentLicenseNumber);
                }

            } else if (command.equals("unregister")) {

                if (!nameLicenseMap.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    System.out.printf("%s unregistered successfully%n", name);
                    nameLicenseMap.remove(name);
                }
            }

        }

        for (Map.Entry<String, String> entry : nameLicenseMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
