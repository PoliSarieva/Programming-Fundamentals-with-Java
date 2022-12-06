import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap <String, String> pieceCompositor = new LinkedHashMap<>();
        LinkedHashMap <String, String> pieceKey = new LinkedHashMap<>();
        for (int numberPiece = 0; numberPiece < n; numberPiece++) {
            String pieceThemselve = scanner.nextLine();

            //"{piece}|{composer}|{key}".
            String piece = pieceThemselve.split("\\|")[0];
            String composer = pieceThemselve.split("\\|")[1];
            String key = pieceThemselve.split("\\|")[2];

            pieceCompositor.put(piece, composer);
            pieceKey.put(piece, key);

        }

        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("Stop")) {

            //•	"Remove|{piece}":
            //o	If the piece is in the collection, remove it and print:
            //"Successfully removed {piece}!"
            //o	Otherwise, print:
            //"Invalid operation! {piece} does not exist in the collection."
            //•	"ChangeKey|{piece}|{new key}":
            //o	If the piece is in the collection, change its key with the given one and print:
            //"Changed the key of {piece} to {new key}!"
            //o	Otherwise, print:
            //"Invalid operation! {piece} does not exist in the collection."
            String command = inputCommand.split("\\|")[0];
            String piece = inputCommand.split("\\|")[1];

            switch (command) {
                case "Add":
                    String composer = inputCommand.split("\\|")[2];
                    String key = inputCommand.split("\\|")[3];

                    if (pieceCompositor.containsKey(piece) && pieceKey.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        pieceCompositor.put(piece, composer);
                        pieceKey.put(piece, key);

                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }

                    break;
                case "Remove":
                    if (pieceCompositor.containsKey(piece) && pieceKey.containsKey(piece)) {
                        pieceCompositor.remove(piece);
                        pieceKey.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;

                case "ChangeKey":
                    String newkey = inputCommand.split("\\|")[2];
                    if (pieceCompositor.containsKey(piece) && pieceKey.containsKey(piece)) {
                        pieceKey.put(piece, newkey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newkey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }

            inputCommand = scanner.nextLine();
        }

        //"{Piece} -> Composer: {composer}, Key: {key}"

        for (Map.Entry<String, String> entry : pieceCompositor.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), pieceKey.get(entry.getKey()));
        }

    }
}
