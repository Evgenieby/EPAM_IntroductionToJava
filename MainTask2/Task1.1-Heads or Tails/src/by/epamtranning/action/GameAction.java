package by.epamtranning.action;

import java.util.Random;

public class GameAction {

    private int heads;
    private int tails;
    private int amountFlips;

    public GameAction() {
        this.amountFlips = 1; // Количество "подбрасываний" монеты по умолчанию
    }

    public int getHeads() {
        return heads;
    }

    public int getTails() {
        return tails;
    }

    public void setAmountFlips(int amountFlips) {
        if (amountFlips > 0) {
            this.amountFlips = amountFlips;
        } else {
            this.amountFlips = 1;
        }
    }

    public void flipsCoin() {
        heads = 0; // Сброс счетчика
        tails = 0; // Сброс счетчика

        Random random = new Random();

        for (int i = 0; i < amountFlips; i++) {
            int randomNumber = random.nextInt();
            if (randomNumber % 2 == 0){
                heads++;
            } else {
                tails++;
            }
        }
    }
}
