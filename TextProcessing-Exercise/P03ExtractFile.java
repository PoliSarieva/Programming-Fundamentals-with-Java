import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] path = input.split("\\\\");
        String lastPath = path[path.length - 1];
        String fileName = lastPath.split("\\.")[0];
        String fileExtension = lastPath.split("\\.")[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", fileExtension);
    }
}
