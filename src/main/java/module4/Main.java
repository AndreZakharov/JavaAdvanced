package module4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import static module4.ReaderForFile.fileReaderMethod;

public class Main {
    public static void main(String[] args) throws IOException {
        readFileAndCountWords("src/main/resources/files/setOfWords.txt");
    }

    public static void readFileAndCountWords(String filepath) throws IOException {
        Map<String, Integer> wordsList = new TreeMap<>();
        String text = fileReaderMethod(filepath);

        String[] words = text.split(" ");
        Arrays.sort(words); //Sort alphabetically.
        for (String word : words) {
            if (!wordsList.containsKey(word)) wordsList.put(word, 1);
            else wordsList.put(word, wordsList.get(word) + 1);
        }
        System.out.println("|Word   |  CountWord|");
        String key = null;
        int value = 0;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordsList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value > maxCount) {
                maxCount = value;
            }
            System.out.println(String.format("|%s|   |%d|", key, value));
        }

        for (Map.Entry<String, Integer> entry : wordsList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value == maxCount)
                System.out.println(String.format("\nThe word '%s' occurs %d times in the file", key, value));
        }
    }
}

