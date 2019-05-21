package by.trainning.matrix.initialization;

import java.util.Random;

public class ArrayInitialization {

    public static double[][] initialize(double[][] array, int startValue, int endValue) {
        if (startValue >= endValue) {
            throw new IllegalArgumentException("Incorrect range");
        }

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = startValue + random.nextDouble() * (endValue - startValue);
            }
        }
        return array;
    }
}
