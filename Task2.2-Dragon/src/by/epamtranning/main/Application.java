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
        int pairEyes = 2;
        DragonHeadAction headAction = new DragonHeadAction();
        System.out.println("Amount of dragon's heads: " + headAction.calcHead(age));
        System.out.println("Amount of dragon's eyes: " + headAction.calcHead(age) * pairEyes);
    }
}
