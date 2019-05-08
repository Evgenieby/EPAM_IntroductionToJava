package by.epamtranning.action;

public class ExchangeNumbers {

    public static void exchangeNum(int inputNum1, int inputNum2){
        if (inputNum1 == inputNum2){
            System.out.println("Numbers do not need to change, they are equal.");
        } else {
            inputNum1 += inputNum2;
            inputNum2 = inputNum1 - inputNum2;
            inputNum1 -= inputNum2;

            System.out.println("Exchange:");
            System.out.println("now number a is " + inputNum1);
            System.out.println("now number b is " + inputNum2);
        }
    }
}