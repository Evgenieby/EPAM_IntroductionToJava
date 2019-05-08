package by.epamtranning.action;

public class AverageNumberAction {

    private int totalDigits;
    private int digit1;
    private int digit2;
    private int digit3;
    private int digit4;
    private int digit5;
    private int digit6;

    private void divisionNumber(int inputNumber){
        totalDigits = (int)Math.log10(inputNumber)+1;
        digit6 = inputNumber % 10;
        digit5 = inputNumber / 10 % 10;
        digit4 = inputNumber / 100 % 10;
        digit3 = inputNumber / 1000 % 10;
        digit2 = inputNumber / 10000 % 10;
        digit1 = inputNumber / 100000 % 10;
    }

    public double calcArithmeticAverage(int inputNumber){
        divisionNumber(inputNumber);
        int digitSum = digit1 + digit2 + digit3 + digit4 + digit5 + digit6;
        return (double)digitSum / totalDigits;
    }

    public double calcGeometricAverage(int inputNumber){
        divisionNumber(inputNumber);
        int digitMultiply = digit1 * digit2 * digit3 * digit4 * digit5 * digit6;
        return Math.pow(digitMultiply, ((double)1 / totalDigits));
    }
}