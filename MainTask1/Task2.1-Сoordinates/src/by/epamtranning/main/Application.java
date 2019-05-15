package by.epamtranning.main;

import by.epamtranning.action.CoordinatesAction;
import by.epamtranning.reader.DataConsoleReader;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        DataConsoleReader reader = new DataConsoleReader();

        System.out.println("Enter coordinates of point A(x;y):");
        int xA = reader.readIntNumber();
        int yA = reader.readIntNumber();

        System.out.println("Enter coordinates of point B(x;y):");
        int xB = reader.readIntNumber();
        int yB = reader.readIntNumber();

        System.out.println("Enter coordinates of point C(x;y):");
        int xC = reader.readIntNumber();
        int yC = reader.readIntNumber();

        CoordinatesAction coordinatesAction = new CoordinatesAction();

        if (!coordinatesAction.isPointOnOneLine(xA, yA, xB, yB, xC, yC)) {
            System.out.println("These points are the vertices of a triangle");
            if (coordinatesAction.isRightTriangle(xA, yA, xB, yB, xC, yC)) {
                System.out.println("This is right triangle.");
            } else {
                System.out.println("This is not right triangle.");
            }
        } else {
            System.out.println("These points are not the vertices of a triangle");
        }
    }
}
