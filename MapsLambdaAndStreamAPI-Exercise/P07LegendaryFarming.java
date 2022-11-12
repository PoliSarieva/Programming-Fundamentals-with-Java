import java.util.*;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap <String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        LinkedHashMap<String , Integer> junkMap = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase(Locale.ROOT);

                if (material.equals("shards")) {
                    int currentQuantity = items.get(material);
                    quantity += currentQuantity;
                    items.put("shards", quantity);
                } else if (material.equals("fragments")) {
                    int currentQuantity = items.get(material);
                    quantity += currentQuantity;
                    items.put("fragments", quantity);
                } else if (material.equals("motes")) {
                    int currentQuantity = items.get(material);
                    quantity += currentQuantity;
                    items.put("motes", quantity);
                } else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, quantity);
                    } else {
                        int currentQuantity = junkMap.get(material);
                        quantity += currentQuantity;
                        junkMap.put(material, quantity);
                    }
                }

                if (items.get("shards") >= 250) {
                    int currentShards = items.get(material);
                    items.put(material, currentShards - 250);
                    System.out.println("Shadowmourne obtained!");
                    isWin = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    int currentFragments = items.get(material);
                    items.put(material, currentFragments - 250);
                    System.out.println("Valanyr obtained!");
                    isWin = true;
                    break;
                } else if (items.get("motes") >= 250) {
                    int currentmotes = items.get(material);
                    items.put(material, currentmotes - 250);
                    System.out.println("Dragonwrath obtained!");
                    isWin = true;
                    break;
                }
            }

            if (isWin) {
                break;
            }
        }

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junkMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }


    }
}

