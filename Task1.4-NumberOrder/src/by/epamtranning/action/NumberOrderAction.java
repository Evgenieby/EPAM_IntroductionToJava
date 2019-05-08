package by.epamtranning.action;

public class NumberOrderAction {

    public static boolean isNumberOrder(int inputNumber) {
        int digit4 = inputNumber % 10;
        int digit3 = inputNumber /10 % 10;
        int digit2 = inputNumber / 100 % 10;
        int digit1 = inputNumber / 1000 % 10;

        return ((digit1 > digit2 && digit2 > digit3 && digit3 > digit4) ||
                (digit1 < digit2 && digit2 < digit3 && digit3 < digit4));
    }
}