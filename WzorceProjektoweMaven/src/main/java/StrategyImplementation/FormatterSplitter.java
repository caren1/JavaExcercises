package StrategyImplementation;

public class FormatterSplitter {
    public String format(String textToFormat) {
//        return textToFormat.replace("", " ").trim();
        byte[] arrayText = textToFormat.getBytes();
        byte[] result = new byte[2*arrayText.length];
        for (int i = 0; i < arrayText.length; i++){
            if (arrayText[i]!= 32)
            result[2*i] = arrayText[i];
            result[2 * i + 1] = 32;
        }
         String r = new String(result).trim();
        return r;
    }
}
