package by.epamtranning.main;

import by.epamtranning.action.GameAction;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {
        GameAction gameAction = new GameAction();
        int amountFlips = 1000; // Количество "подбрасываний" монеты
        gameAction.setAmountFlips(amountFlips);
        gameAction.flipsCoin();
        System.out.println("Number of flips: " + amountFlips);
        System.out.println("Number of heads: " + gameAction.getHeads());
        System.out.println("Number of tails: " + gameAction.getTails());
    }
}
