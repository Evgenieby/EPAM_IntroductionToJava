package by.epamtranning.main;

import by.epamtranning.action.CircleAction;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();
        System.out.println("Enter outer ring radius R1(integer):");
        int outerRadius = reader.readIntNumber();

        System.out.println("Enter inner ring radius R2(integer):");
        int innerRadius = reader.readIntNumber();

        CircleAction circleAction = new CircleAction();

        if (outerRadius <= 0 && innerRadius <= 0) {
            System.out.println("Radius cannot be negative");
        } else if (outerRadius > innerRadius) {
            System.out.println("Ring square is " + circleAction.calcSquareOfRing(outerRadius, innerRadius));
        } else {
            System.out.println("Outer radius R1 less inner radius R2");
        }
    }
}
