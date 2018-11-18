package Zadanie0;

public class FormatterUpper implements IFontFormatter {

    @Override
    public String formatText(String textToBeChanged) {
        return textToBeChanged.toUpperCase();
    }
}
