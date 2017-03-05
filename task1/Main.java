package lesson9.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Артём on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Ivanov", 7, 22));
        students.add(new Student("Petr", "Petrov", 8, 21));
        students.add(new Student("Pavel", "Morozov", 6, 20));

        Collections.sort(students, Collections.reverseOrder(new ByMark()));

        System.out.println("По среднему баллу");
        for (Student i : students) {
            System.out.println(i.getFullName());
        }

        Collections.sort(students, new ByFullName());

        System.out.println("По имени");
        for (Student i : students) {
            System.out.println(i.getFullName());
        }

        Collections.sort(students, new ByAge());

        System.out.println("По возрасту");
        for (Student i : students) {
            System.out.println(i.getFullName());
        }

        int maxMark = students.get(0).getMark();

        Iterator <Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student i = iterator.next();
            if(i.getMark() > maxMark) {
                maxMark = i.getMark();
            }
        }
    }
}
