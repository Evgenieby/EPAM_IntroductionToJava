package by.epamtranning.action;

public class CheckEqualityInequality {

    public CheckEqualityInequality() {
    }

    public boolean isEquality(int firstNum, int secondNum, int thirdNum) {
        return (firstNum == secondNum) && (firstNum == thirdNum);
    }

    public boolean isInequality(int firstNum, int secondNum, int thirdNum) {
        return (firstNum != secondNum) && (firstNum != thirdNum) && (secondNum != thirdNum);
    }
}
