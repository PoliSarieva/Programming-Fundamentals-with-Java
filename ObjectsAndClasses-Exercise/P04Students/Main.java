package P04Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Studens> studentsList = new ArrayList<>();

        for (int i = 0; i < countStudents; i++) {
            String students = scanner.nextLine();

            String name = students.split(" ")[0];
            String secondName = students.split(" ")[1];
            double grade = Double.parseDouble(students.split(" ")[2]);

            Studens studens = new Studens(name, secondName, grade);
            studentsList.add(studens);
        }

        studentsList.sort(Comparator.comparing(Studens:: getGrade).reversed());

        for (Studens studens:studentsList) {
            System.out.println(studens);
        }
    }
}
