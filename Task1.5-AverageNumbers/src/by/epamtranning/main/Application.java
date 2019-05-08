package by.epamtranning.main;

import by.epamtranning.action.AverageNumberAction;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();
        System.out.println("Enter positive six-digit number:");
        int inputNumber = reader.readIntNumber();
        AverageNumberAction averageNumberAction = new AverageNumberAction();
        int amountDigit = 6;

        if (((int)Math.log10(inputNumber)+1) == amountDigit){
            System.out.println("The arithmetic average: " + averageNumberAction.calcArithmeticAverage(inputNumber));
            System.out.println("The geometric average: " + averageNumberAction.calcGeometricAverage(inputNumber));
        } else {
            System.out.println("The number is not six-digit.");
        }
    }
}
