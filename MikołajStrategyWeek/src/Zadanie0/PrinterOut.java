package Zadanie0;

import java.util.Scanner;

public class PrinterOut {

    private IFontFormatter strategy;

    public PrinterOut() {
        strategy = new FormatterUpper();
    }

    public void setStrategy(IFontFormatter strategy) {
        this.strategy = strategy;
    }

    public void print(String text) {
        String formattedText = strategy.formatText(text);
        System.out.println(formattedText);
    }

    public void run() {
        System.out.println("WELCOME TO STRING FORMATTER");
        Scanner sc = new Scanner(System.in);

        boolean shouldItWork = true;
        while (shouldItWork) {
            System.out.println("\n\r"+ "Would you like to : change (changes current format)," +
                    " format (print out the given text or end (ends the program) ");

            String userChoiceInput = sc.nextLine();
            switch (userChoiceInput) {

                case ("change"):
                    System.out.println("Choose the type of formatting : inverter, lower, splitter, trim, upper .");
                    setStrategy(changeTheFormatter(sc.nextLine()));
                    break;

                case ("format"):
                    System.out.println("Please provide the text to be formatted");
                    String userText = sc.nextLine();
                    print(userText);
                    break;

                case ("end"):
                    shouldItWork = false;
                    break;

                default:
                    System.out.println("You have provided the wrong input..");
                    break;
            }
        }

    }

    public IFontFormatter changeTheFormatter(String tekst) {
        if (tekst.equals("upper")) {
            this.strategy = new FormatterUpper();
            return strategy;
        } else if (tekst.equals("lower")) {
            this.strategy = new FormatterLower();
            return strategy;
        } else if (tekst.equals("trim")) {
            this.strategy = new FormatterTrim();
            return strategy;
        } else if (tekst.equals("splitter")) {
            this.strategy = new FormatterSplitter();
            return strategy;
        } else if (tekst.equals("Inverter")) {
            this.strategy = new FormatterInverter();
        }
        return strategy;
    }
}
