package Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class StudentBook {
    private List<Student> studentList = new ArrayList<>();
    private LineGenerator lineGenerator;
    private FileOperator fileOperator;

    public StudentBook(LineGenerator lineGenerator, FileOperator fileOperator) {
        this.lineGenerator = lineGenerator;
        this.fileOperator = fileOperator;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void save(){
        List<String> lines = lineGenerator.getLinesFrom(studentList);
        fileOperator.saveToFile(lines);
    }
}
