package by.epamtranning.action;

public class NumberAction {

    public int maxDigitNaturalNum(int inputNum) {
        if (inputNum <= 0) {
            throw new IllegalArgumentException("Number is not natural");
        }

        int maxDigit = 0;

        while (inputNum > 0) {
           if((inputNum % 10) > maxDigit) {
               maxDigit = inputNum % 10;
           }
            inputNum /= 10;
        }
        return maxDigit;
    }

    public boolean isPalindromicNum(int inputNum) {
        if (inputNum <= 0) {
            throw new IllegalArgumentException("Number is not natural");
        }

        int reverseNum = 0;
        int number = inputNum;

        while (inputNum > 0) {
            int module = inputNum % 10;
            inputNum /= 10;
            reverseNum = reverseNum * 10 + module;
        }
        return (number == reverseNum);
    }

    public boolean isPrimeNum(int inputNum) {
        if (inputNum < 2) {
            throw new IllegalArgumentException("Number is not correct");
        }

        for (int i = 2; (i * i) <= inputNum; i++) {
            if (inputNum % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void findSimpleDividers(int inputNum) {
        if (inputNum <= 0) {
            throw new IllegalArgumentException("Number is not natural");
        }

        for (int i = 2; i <= (inputNum / 2); i++) {
            if ((inputNum % i == 0) && isPrimeNum(i)) {
                System.out.println(i);
            }
        }
    }

    public int findGCD(int inputNumA, int inputNumB) {
        if ((inputNumA <= 0) && (inputNumB <= 0)) {
            throw new IllegalArgumentException("Number is not natural");
        }
        return (inputNumB == 0 ? inputNumA
                               : findGCD(inputNumB,inputNumA % inputNumB));
    }

    public int findLCM(int inputNumA, int inputNumB) {
        if ((inputNumA <= 0) && (inputNumB <= 0)) {
            throw new IllegalArgumentException("Number is not natural");
        }
        return (inputNumA / findGCD(inputNumA, inputNumB) * inputNumB);
    }

    public int amountOfDiffDigit(int inputNum) {
        if (inputNum <= 0) {
            throw new IllegalArgumentException("Number is not natural");
        }

        int diffDigit = 0;

        while (inputNum > 0) {
            int digit = inputNum % 10;
            int amountRepeatedDigit = 0;
            int copyInputNum = inputNum;

            while (copyInputNum > 0) {
                if (copyInputNum % 10 == digit) {
                   amountRepeatedDigit++;
                }
                copyInputNum /= 10;
            }

            if (amountRepeatedDigit == 1) { // 1 - коэффициент уникальности (одна цифра в числе)
                diffDigit++;
            }
            inputNum /= 10;
        }
        return diffDigit;
    }
}
