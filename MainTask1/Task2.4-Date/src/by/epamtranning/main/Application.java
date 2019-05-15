package by.epamtranning.main;

import by.epamtranning.action.DateAction;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();
        System.out.println("Enter day(number):");
        int day = reader.readIntNumber();

        System.out.println("Enter month(number):");
        int month = reader.readIntNumber();

        System.out.println("Enter year:");
        int year = reader.readIntNumber();

        DateAction dateAction = new DateAction();
        dateAction.findNextDay(day, month, year);

        System.out.printf("Entered date: %d.%d.%d \n", day, month, year);
        System.out.printf("Date of next day: %d.%d.%d", dateAction.getNextDay(),
                           dateAction.getNextMonth(), dateAction.getNextYear());
    }
}
