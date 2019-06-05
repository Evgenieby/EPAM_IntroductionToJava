package by.trainning.matrix.action;

public class MatrixTransposition {

    /* Транспонирование матрицы. */
    public double[][] transposeMatrix(double[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("No array");
        }

        int rowLength = array.length;
        int colLength = array[0].length;

        if (rowLength == colLength) {
            return transposeQuadraticMatrix(array);
        } else {
            return transposeRectangularMatrix(array);
        }
    }

    /* Транспонирование матрицы без задействования дополнительной памяти. */
    private double[][] transposeQuadraticMatrix(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                double temp = array[i][j];
                array[i][j] = array [j][i];
                array[j][i] = temp;
            }
        }
        return array;
    }

    /* Транспонирование матрицы с задействования дополнительной памяти. */
    private double[][] transposeRectangularMatrix(double[][] array) {
        double[][] transArray = new double[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transArray[j][i] = array[i][j];
            }
        }
        return transArray;
    }
}
