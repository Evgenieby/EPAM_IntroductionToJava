package by.trainning.matrix.action;

public class MinMaxValuesArray {

    public double searchMinElement(double[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("No array");
        }

        double minElement = array[0][0];

        for (double[] arr : array) {
            for (double arrElement : arr) {
                if (arrElement < minElement) {
                    minElement = arrElement;
                }
            }
        }
        return minElement;
    }

    public double searchMaxElement(double[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("No array");
        }

        double maxElement = array[0][0];

        for (double[] arr : array) {
            for (double arrElement : arr) {
                if (arrElement > maxElement) {
                    maxElement = arrElement;
                }
            }
        }
        return maxElement;
    }

    public double searchLocalMax(double[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("No array");
        }

        double localMax = -1; // Возвращаемое значение при отсутствии локального максимума

        int colLength = array.length - 1;

        for (int i = 1; i < colLength; i++) {
            int rowLength = array[i].length - 1;

            for (int j = 1; j < rowLength; j++) {
                if ((array[i][j] > array[i][j - 1])
                        && (array[i][j] > array[i][j + 1])
                        && (array[i][j] > array[i - 1][j])
                        && (array[i][j] > array[i + 1][j])
                        && (array[i][j] > array[i + 1][j + 1])
                        && (array[i][j] > array[i - 1][j - 1])
                        && (array[i][j] > array[i - 1][j + 1])
                        && (array[i][j] > array[i + 1][j - 1])) {
                    localMax = array[i][j];
                    return localMax;
                }
            }
        }
        return localMax;
    }

    public double searchLocalMin(double[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("No array");
        }

        double localMin = -1; // Возвращаемое значение при отсутствии локального минимума

        int colLength = array.length - 1;

        for (int i = 1; i < colLength; i++) {
            int rowLength = array[i].length - 1;

            for (int j = 1; j < rowLength; j++) {
                if ((array[i][j] < array[i][j - 1])
                     && (array[i][j] < array[i][j + 1])
                     && (array[i][j] < array[i - 1][j])
                     && (array[i][j] < array[i + 1][j])
                     && (array[i][j] < array[i + 1][j + 1])
                     && (array[i][j] < array[i - 1][j - 1])
                     && (array[i][j] < array[i - 1][j + 1])
                     && (array[i][j] < array[i + 1][j - 1])) {
                    localMin = array[i][j];
                    return localMin;
                }
            }
        }
        return localMin;
    }
}
