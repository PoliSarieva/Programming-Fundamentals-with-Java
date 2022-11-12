import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Double> nameGrade = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!nameGrade.containsKey(name)) {
                nameGrade.put(name, grade);
            } else {
                double currentGrade = nameGrade.get(name);
                double averideGrade = (currentGrade + grade) / 2;
                nameGrade.put(name, averideGrade);
            }
        }

        for (Map.Entry<String, Double> entry : nameGrade.entrySet()) {
            if (entry.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }
        }

    }
}
