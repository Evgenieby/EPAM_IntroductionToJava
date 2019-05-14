package by.epamtranning.action;

public class NumberAction {

    public boolean isPerfectNumber(int inputNum) {
        if (inputNum <= 0) {
            throw new IllegalArgumentException("Number is not natural");
        }

        int sumDivisors = 0; // Сумма всех делителей

        for (int i = 1; i <= (inputNum / 2); i++) {
            if ((inputNum % i) == 0) {
                sumDivisors += i;
            }
        }
        return inputNum == sumDivisors;
    }
}