package Zadanie0;

public class FormatterSplitter implements IFontFormatter {

    @Override
    public String formatText(String textToBeChanged) {
        return textToBeChanged.replace("", " ").trim();
    }
}
