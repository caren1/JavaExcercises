package Zadanie2;

public class Main {
    public static void main(String[] args) {
        Student wojtek = new Student("Wojciech", "Czarnocki", "234002");
        Student piotrek = new Student("Piotr", "Oziewicz", "060794");
        Student aga = new Student("Aga", "Chodań", "270294");

        StudentBook studentBook = new StudentBook(new FieldNamedParametersLineGenerator(), new BufferedWriterFileOperator());

        studentBook.addStudent(wojtek);
        studentBook.addStudent(piotrek);
        studentBook.addStudent(aga);

        studentBook.save();
    }
}
