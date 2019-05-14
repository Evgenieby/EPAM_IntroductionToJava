package by.epamtranning.main;

import by.epamtranning.action.MassConverter;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();
        System.out.println("Enter dinosaur mass in kilogramme:");
        int massDinosaur = reader.readIntNumber();

        if (massDinosaur > 0) {
            MassConverter converter = new MassConverter();
            System.out.println("Dinosaur mass in milligramme:" + converter.convertToMilligramme(massDinosaur));
            System.out.println("Dinosaur mass in gramme:" + converter.convertToGramme(massDinosaur));
            System.out.println("Dinosaur mass in tonne:" + converter.convertToTonne(massDinosaur));
        } else {
            System.out.println("Dinosaur mass cannot be a negative number or zero.");
        }

    }
}
