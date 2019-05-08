package by.epamtranning.main;

import by.epamtranning.action.ReverseNumber;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();
        System.out.println("Enter positive seven-digit number:");
        int inputNumber = reader.readIntNumber();
        ReverseNumber reverseNumber = new ReverseNumber();
        int amountDigit = 7;

        if (((int)Math.log10(inputNumber)+1) == amountDigit){
            System.out.println("Inverted number: " + reverseNumber.invertNumber(inputNumber));
        } else {
            System.out.println("The number is not seven-digit.");
        }
    }
}
