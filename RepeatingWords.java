package lesson10;

import java.util.*;

/**
 * Created by Артём on 12.03.2017.
 */
public class RepeatingWords {
    public static void main(String[] args) {

        List<String> text = new ArrayList<>();
        Collections.addAll(text, "Hello ", "hello ", "world ", ", ", "glad ", "to ", "to ", "see ", "you ", "you ", "! ");

        System.out.println("Неповторяющиеся слова - "+unicWords(text));

        Map<String, Integer> map = new HashMap<>();
        int numberOfSameWords = 1;
        for (String word : text) {
            if (map.containsKey(word)) {
                map.put(word, numberOfSameWords+1);
            } else {
                map.put(word, numberOfSameWords);
            }
        }
        for (Map.Entry<String, Integer> words : map.entrySet()) {
            System.out.println("Количество слов  " + words.getKey() + " в тексте -  " + words.getValue());
        }
    }
    private static String unicWords (List<String> strings) {
        return new HashSet<>(strings).toString();
    }
}