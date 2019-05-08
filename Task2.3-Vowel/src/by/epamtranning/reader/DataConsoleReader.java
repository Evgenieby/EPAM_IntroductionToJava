package by.epamtranning.reader;

import java.util.Scanner;

public class DataConsoleReader {

    public char readChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
