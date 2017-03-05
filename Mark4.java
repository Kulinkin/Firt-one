package lesson9;

import java.util.ArrayList;
import java.util.List;

public class Mark4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");

        markLength4(list);

        for(String i : list) {
            System.out.println(i);
        }
    }

    public static void markLength4(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
    }
}
