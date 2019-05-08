package by.epamtranning.action;

public class ReverseNumber {

    private int digit1;
    private int digit2;
    private int digit3;
    private int digit4;
    private int digit5;
    private int digit6;
    private int digit7;

    private void divisionNumber(int inputNumber){
        digit7 = inputNumber % 10;
        digit6 = inputNumber / 10 % 10;
        digit5 = inputNumber / 100 % 10;
        digit4 = inputNumber / 1000 % 10;
        digit3 = inputNumber / 10000 % 10;
        digit2 = inputNumber / 100000 % 10;
        digit1 = inputNumber / 1000000 % 10;
    }

    public int invertNumber(int inputNumber){
        divisionNumber(inputNumber);
        return (digit7 * 1000000) + (digit6 * 100000) + (digit5 * 10000) +
                (digit4 * 1000) + (digit3 * 100) + (digit2 * 10) + digit1;
    }
}