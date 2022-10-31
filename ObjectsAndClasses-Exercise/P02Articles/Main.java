package P02Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(", ");
        String title = inputArr[0];
        String content = inputArr[1];
        String author = inputArr[2];

        int n = Integer.parseInt(scanner.nextLine());

        Article article = new Article(title, content, author);
        for (int i = 0; i < n; i++) {
            String inputCommands = scanner.nextLine();
            String[] inputCommandsArr = inputCommands.split(": ");
            String command = inputCommandsArr[0];

            switch (command) {
                case "Edit":
                    String newContent = inputCommandsArr[1];
                    article.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = inputCommandsArr[1];
                    article.changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = inputCommandsArr[1];
                    article.rename(newTitle);
                    break;
            }

        }
        System.out.println(article.toString());
    }
}
