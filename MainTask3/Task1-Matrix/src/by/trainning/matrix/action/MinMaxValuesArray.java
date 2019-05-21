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

        for (double[] arr : array) {
            int rowLength = arr.length - 1;

            for (int j = 1; j < rowLength; j++) {
                if ((arr[j] > arr[j - 1]) && (arr[j] > arr[j + 1])) {
                    localMax = arr[j];
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

        for (double[] arr : array) {
            int rowLength = arr.length - 1;

            for (int j = 1; j < rowLength; j++) {
                if ((arr[j] < arr[j - 1]) && (arr[j] < arr[j + 1])) {
                    localMin = arr[j];
                    return localMin;
                }
            }
        }
        return localMin;
    }
}
