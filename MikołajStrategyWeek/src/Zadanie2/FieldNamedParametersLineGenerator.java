package Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class FieldNamedParametersLineGenerator implements LineGenerator {

    @Override
    public List<String> getLinesFrom(List<Student> students) {
        List<String> lines = new ArrayList<>();
        for (Student student : students) {
            lines.add(toLine(student));
        }
        return lines;
    }

    private String toLine(Student student) {
        String result = "{firstName: " + student.getFirstName() +
                ", lastName: " + student.getLastName() +
                ", id: " + student.getId() + "}" + "\n\r";
        return result;
    }
}

