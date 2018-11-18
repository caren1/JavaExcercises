package StrategyImplementation;

public class FormatterUpper implements FormatterFont {
    public String format(String textToFormat) {
        return textToFormat.toUpperCase();
    }
}
