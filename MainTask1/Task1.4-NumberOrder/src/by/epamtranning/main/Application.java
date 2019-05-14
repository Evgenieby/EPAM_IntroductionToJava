package by.epamtranning.main;

import by.epamtranning.action.NumberOrderAction;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();
        System.out.println("Enter positive four-digit number:");
        int inputNumber = reader.readIntNumber();
        int amountDigit = 4; // Количество цифр в числе

        if (((int) Math.log10(inputNumber) + 1) == amountDigit) { // Проверка количества цифр в числе
            if (NumberOrderAction.isNumberOrder(inputNumber)) {
                System.out.println("The number is consistent.");
            } else {
                System.out.println("The number is not consistent.");
            }
        } else {
            System.out.println("The number is not four-digit.");
        }
    }
}
