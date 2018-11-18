package Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class TripleParametersLineGenerator implements LineGenerator {

    public List<String> getLinesFrom(List<Student> students) {
        List<String> lines = new ArrayList<>();
        for (Student student : students) {
            lines.add(toLine(student));
        }
        return lines;
    }

    private String toLine(Student student) {
        String result = student.getFirstName() + student.getLastName() + ";" + student.getId();
        return result;
    }
}

