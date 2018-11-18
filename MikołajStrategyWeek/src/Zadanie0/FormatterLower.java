package Zadanie0;

public class FormatterLower implements IFontFormatter {
    @Override
    public String formatText(String textToBeChanged) {
        return textToBeChanged.toLowerCase();
    }
}
