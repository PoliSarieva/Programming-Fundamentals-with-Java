package P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);

            if (age>30) {
                Person person = new Person(name, age);
                peopleList.add(person);
            }
        }

        for (Person person:peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
