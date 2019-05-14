package by.epamtranning.main;

import by.epamtranning.action.CheckEqualityInequality;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();
        System.out.println("Enter integer a:");
        int firstNumber = reader.readIntNumber();
        System.out.println("Enter integer b:");
        int secondNumber = reader.readIntNumber();
        System.out.println("Enter integer c:");
        int thirdNumber = reader.readIntNumber();

        CheckEqualityInequality equalityInequality = new CheckEqualityInequality();

        if (equalityInequality.isEquality(firstNumber, secondNumber, thirdNumber)){
            System.out.println("Numbers are equal");
        } else if ( equalityInequality.isInequality(firstNumber, secondNumber, thirdNumber)){
            System.out.println("Numbers are not equal");
        } else {
            System.out.println("Only two numbers are equal");
        }
    }
}
