package by.epamtranning.main;

import by.epamtranning.action.ExchangeNumbers;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();

        System.out.println("Enter number a:");
        int inputNumberA = reader.readIntNumber();

        System.out.println("Enter number b:");
        int inputNumberB = reader.readIntNumber();

        ExchangeNumbers.exchangeNum(Math.abs(inputNumberA), Math.abs(inputNumberB));


    }
}
