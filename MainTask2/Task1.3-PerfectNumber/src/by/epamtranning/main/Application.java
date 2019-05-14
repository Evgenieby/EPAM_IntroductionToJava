package by.epamtranning.main;

import by.epamtranning.action.NumberAction;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        NumberAction numberAction = new NumberAction();

        /* Является ли введённое натуральное число совершенным. */
        int inputNumber = 496; // Совершенные числа 6, 28, 496, 8128, ...

        if (numberAction.isPerfectNumber(inputNumber)) {
            System.out.printf("Number %d is perfect", inputNumber);
        } else {
            System.out.printf("Number %d is not perfect", inputNumber);
        }
    }
}
