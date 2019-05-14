package by.epamtranning.main;

import by.epamtranning.action.NumberAction;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        NumberAction numberAction = new NumberAction();

        /* Найти все дружественные числа в заданном диапазоне. */
        int rangeNum = 6500; // Диапозон для выборки
        int index = 2;

        for (int number1 = index; number1 <= rangeNum; number1++) {
            for (int number2 = number1; number2 <= rangeNum; number2++) {
                if (numberAction.isFriendlyNum(number1, number2)
                        && (number1 < number2)) {
                    System.out.printf("Numbers %d and %d is friendly\n",
                                      number1, number2);
                    break;
                }
            }
        }
    }
}
