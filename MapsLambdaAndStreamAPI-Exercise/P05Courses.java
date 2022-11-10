import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> courseStudentMap = new LinkedHashMap<>();

        while (!input.contains("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courseStudentMap.containsKey(courseName)) {
                courseStudentMap.put(courseName, new ArrayList<>());
            }
            courseStudentMap.get(courseName).add(studentName);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseStudentMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(),entry.getValue().size());

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }

    }
}
