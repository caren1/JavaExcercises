package StrategyImplementation;

public class FormatterLower implements FormatterFont {
    public String format(String textToFormat) {
        return textToFormat.toLowerCase();
    }
}
