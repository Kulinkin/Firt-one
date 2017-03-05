package lesson9.task1;

import java.util.Comparator;

/**
 * Created by Артём on 05.03.2017.
 */
public class ByFullName implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getFullName().compareTo(secondStudent.getFullName());
    }
}
