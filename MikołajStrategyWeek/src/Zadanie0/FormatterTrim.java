package Zadanie0;

public class FormatterTrim implements IFontFormatter {
    @Override
    public String formatText(String textToBeChanged) {
        return textToBeChanged.trim();
    }
}
