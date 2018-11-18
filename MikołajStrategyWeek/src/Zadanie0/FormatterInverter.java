package Zadanie0;

public class FormatterInverter implements IFontFormatter {

    @Override
    public String formatText(String textToBeChanged) {
        byte[] textArray = textToBeChanged.getBytes();

        for (int i = 0; i < textArray.length; i++) {

            if (textArray[i] > 64 && textArray[i] < 91) {
                textArray[i] = (byte) (textArray[i] + 32);

            } else if (textArray[i] > 96 && textArray[i] < 123) {
                textArray[i] = (byte) (textArray[i] - 32);
            }
            if (textArray[i] == 32)
                System.out.print(" ");
        }
        return new String(textArray);
    }
}

