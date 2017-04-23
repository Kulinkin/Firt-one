package lesson18;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class SimpleReport {
    private static final String DIR_PATH = "src" + File.separator + "lesson18";



    public static void main(String[] args) throws IOException {
        File logFile = new File(DIR_PATH, "log_file.log");
        File reportFile = new File(DIR_PATH, "report.txt");
        reportFile.createNewFile();


        List<String> time = new ArrayList();
        List<String> activity = new ArrayList();

        Pattern pattern = Pattern.compile("(\\d{2}:\\d{2})\\s(.+)");
        Matcher matcher = pattern.matcher("");

        try(Scanner scanner = new Scanner(logFile)) {
            while (scanner.hasNextLine()) {
                matcher.reset(scanner.nextLine());
                while (matcher.find()) {
                    time.add(matcher.group(1));
                    activity.add(matcher.group(2));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter fileWriter = new FileWriter(reportFile);
        for (int i = 0; i <= time.size() - 1; i++) {
            if (!activity.get(i).contains("Конец")) {
                fileWriter.write(time.get(i) + "-" + time.get(i + 1) + " " + activity.get(i) + "\n");
            } else {
                fileWriter.write(time.get(i)+" "+activity.get(i)+"\n\n");
            }
        }
        fileWriter.flush();
        fileWriter.close();
    }
}