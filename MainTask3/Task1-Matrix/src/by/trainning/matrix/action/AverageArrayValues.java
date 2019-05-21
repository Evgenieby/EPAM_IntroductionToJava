package by.trainning.matrix.action;

public class AverageArrayValues {

    public double calcArithmeticalAverage(double[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("No array");
        }

        double sumElements = 0;

        for (double[] arr : array) {
            for (double arrElement : arr) {
                sumElements += arrElement;
            }
        }

        return (sumElements / calcElementAmount(array));
    }

    public double calcGeometricalAverage(double[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("No array");
        }

        double productElements = 1.0;

        for (double[] arr : array) {
            for (double arrElement : arr) {
                productElements *= arrElement;
            }
        }

        return (Math.pow(productElements, (1.0 / (double) calcElementAmount(array))));
    }

    private int calcElementAmount(double[][] array) {
        int amountElements = 0;

        for (double[] arr : array) {
            amountElements += arr.length;
        }

        return amountElements;
    }
}
