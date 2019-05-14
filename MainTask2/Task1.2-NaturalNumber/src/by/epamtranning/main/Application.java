package by.epamtranning.main;

import by.epamtranning.action.NumberAction;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        NumberAction numberAction = new NumberAction();

        /* Найти наибольшую цифру натурального числа. */
        int inputNumber1 = 538724501;

        int maxDigit = numberAction.maxDigitNaturalNum(inputNumber1);
        System.out.println("Maximum digit of " + inputNumber1 + " is " + maxDigit);

        /* Проверить является ли заданное натуральное число палиндромом. */
        int inputNumber2 = 412343214;

        if (numberAction.isPalindromicNum(inputNumber2)) {
            System.out.println("Number " + inputNumber2 + " is palindromic");
        } else {
            System.out.println("Number " + inputNumber2 + " is not palindromic");
        }

        /* Проверить является ли заданное натуральное число простым. */
        int inputNumber3 = 31;

        if (numberAction.isPrimeNum(inputNumber3)) {
            System.out.println("Number " + inputNumber3 + " is prime");
        } else {
            System.out.println("Number " + inputNumber3 + " is not prime");
        }

        /* Найти все простые делители заданного натурального числа. */
        int inputNum4 = 2345;

        System.out.printf("Simple dividers of number %d is: \n", inputNum4);
        numberAction.findSimpleDividers(inputNum4);

        /* Найти НОД и НОК двух натуральных чисел a и b. */
        int inputNum5 = 23;
        int inputNum6 = 567;

        int gcd = numberAction.findGCD(inputNum5, inputNum6);
        System.out.printf("Greatest Common Divisor of numbers %d and %d is %d\n",
                          inputNum5, inputNum6, gcd);

        int lcm = numberAction.findLCM(inputNum5, inputNum6);
        System.out.printf("Least Common Multiple of numbers %d and %d is %d\n",
                          inputNum5, inputNum6, lcm);

        /* Найти количество различных цифр у заданного натурального числа. */
        int inputNum7 = 146643788;

        int diffDigit = numberAction.amountOfDiffDigit(inputNum7);
        System.out.printf("The number of different digits of the number %d is %d\n",
                          inputNum7, diffDigit);
    }
}
