import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();

        for (String words:wordsArr) {
            String word = words.toLowerCase();

            if (!wordMap.containsKey(word)) {
                wordMap.put(word, 0);
            }
            int value = wordMap.get(word);
            wordMap.put(word, value + 1);

        }

        List<String> numbersArr = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                numbersArr.add(entry.getKey());
            }
        }

            System.out.println(String.join(", ", numbersArr));
    }
}
