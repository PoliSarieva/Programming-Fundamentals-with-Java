import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        int count = 1;

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            int value = 0;

                if (!resourcesMap.containsKey(resource)) {
                    resourcesMap.put(resource, quantity);
                } else {
                   int currentQuantity = resourcesMap.get(resource);
                   resourcesMap.put(resource, currentQuantity + quantity);
                }
            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
    }

