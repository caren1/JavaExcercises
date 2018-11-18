package StrategyImplementation;

public class FormatterTrim implements FormatterFont {
    public String format(String textToFormat) {
        return textToFormat.trim();
    }
}
