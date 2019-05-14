package by.epamtranning.reader;

import java.util.Scanner;

public class DataConsoleReader {

    public int readIntNumber() {
        int inputNumber;

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            inputNumber = scanner.nextInt();
            return inputNumber;
        } else {
            System.out.println("This is incorrect number. Try again.");
            scanner.next();
            inputNumber = readIntNumber();
        }
        return inputNumber;
    }
}
