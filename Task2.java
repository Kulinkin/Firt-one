package lesson13;


import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File directory = new File("src" + File.separator + "lesson13");
        File randomNumbers = new File(directory, "random.txt");
        randomNumbers.createNewFile();
        FileWriter writeRandomNumbers = new FileWriter(randomNumbers);
        Random random = new Random();
        for (int i = 0; i < 50; i++){
            writeRandomNumbers.write((random.nextInt(150)) + "\n");
        }
//        int randomLength = (int) Math.random();        почему нельзя сделать так?
//        for (int i = 0; i < randomLength; i++) {       выкидавает переполнение памяти
//            writeRandomNumbers.write((int)Math.random() + "\n");
//        }
        writeRandomNumbers.flush();
        writeRandomNumbers.close();

        File resultFile = new File(directory, "randomSortedResult.txt");
        resultFile.createNewFile();

        Scanner scanner = new Scanner(new FileInputStream(randomNumbers));
        List <Integer> list = new ArrayList();
        while (scanner.hasNextLine()) {
            list.add(Integer.parseInt (scanner.nextLine()));
        }
        Collections.sort(list);

        Writer writeSortedNumbers = new PrintWriter(resultFile);
        for (Integer i :list) {
            writeSortedNumbers.write(i + "\n");
        }
        
        writeSortedNumbers.flush();
        writeSortedNumbers.close();
    }
}
