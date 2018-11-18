package StrategyImplementation;

public class FormatterInverter implements FormatterFont {
    public String format(String textToFormat) {
        byte[] textArray = textToFormat.getBytes();
        for (int i = 0; i < textArray.length; i++){
            if (textArray[i] >= 65 && textArray[i] <= 90){
                textArray[i] = (byte)(textArray[i] + 32);
            }
            if (textArray[i] >= 97 && textArray[i] <= 122){
                textArray[i] = (byte) ((textArray[i]) - 32);
            }
        }
        return new String(textArray);
    }
}
