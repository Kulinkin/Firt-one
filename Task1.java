package lesson13;

import java.io.*;
import java.util.*;

public class Task1 {

    public static void main(String[] args){
        File directory = new File("src" + File.separator + "lesson13");
        File file = new File(directory, "poem.txt");
        File resultFile = new File(directory, "poemLettersCount.txt");
        Map<Character, Integer> map = new HashMap<>();

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile))) {

                while (scanner.hasNextLine()) {
                    StringBuffer sb = new StringBuffer(scanner.nextLine().toLowerCase());
                    for (int i = 0; i <= sb.length() - 1; i++) {
                        map.put(sb.charAt(i), map.containsKey(sb.charAt(i)) ? map.get(sb.charAt(i)) + 1 : 1);
                    }
                }
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    bufferedWriter.write(entry.getKey() + " " + entry.getValue() + "\n");
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
