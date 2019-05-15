package by.epamtranning.main;

import by.epamtranning.action.DragonHeadAction;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();

        System.out.println("Enter age of dragon:");
        int age = reader.readIntNumber();
        int pairEyes = 2; // Количество глаз на голове по умолчанию

        DragonHeadAction headAction = new DragonHeadAction();

        if (age > 0) {
            System.out.println("Amount of dragon's heads: " + headAction.calcHead(age));
            System.out.println("Amount of dragon's eyes: " + headAction.calcHead(age) * pairEyes);
        } else {
            System.out.println("Age cannot be negative or zero");
        }

    }
}
