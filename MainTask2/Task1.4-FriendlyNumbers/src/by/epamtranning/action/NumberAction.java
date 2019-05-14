package by.epamtranning.action;

public class NumberAction {

    public int sumDivisorsNum(int inputNum) {
        int sumDivisors = 0; // Сумма всех собственных делителей

        for (int i = 1; i <= (inputNum / 2); i++) {
            if ((inputNum % i) == 0) {
                sumDivisors += i;
            }
        }
        return sumDivisors;
    }

    public boolean isFriendlyNum(int inputNum1, int inputNum2) {
        if ((inputNum1 <= 0) || (inputNum2 <= 0)
                || (inputNum1 == inputNum2)) {
            return false;
        }
        return (sumDivisorsNum(inputNum1) == inputNum2
                && sumDivisorsNum(inputNum2) == inputNum1);
    }
}
