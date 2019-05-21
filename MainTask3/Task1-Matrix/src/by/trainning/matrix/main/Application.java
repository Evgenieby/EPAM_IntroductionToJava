package by.trainning.matrix.main;

import by.trainning.matrix.action.AverageArrayValues;
import by.trainning.matrix.action.MatrixTransposition;
import by.trainning.matrix.action.MinMaxValuesArray;
import by.trainning.matrix.initialization.ArrayInitialization;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        application.beginApp();
    }

    private void beginApp() {

        /* Создание и иницилизация массива*/
        int col = 7;
        int row = 9;
        int startValue = 2; // Начало диапазона случайных значений
        int endValue = 100; // Конец диапазона случайных значений

        double[][] testArray = new double[col][row];
        ArrayInitialization.initialize(testArray, startValue, endValue);
        printArray(testArray);

        /* Нахождение min/max значения массива. */
        MinMaxValuesArray minMaxValuesArray = new MinMaxValuesArray();

        // Max значение.
        double maxValue = minMaxValuesArray.searchMaxElement(testArray);
        System.out.println("Max value of array: " + maxValue);

        // Min значение.
        double minValue = minMaxValuesArray.searchMinElement(testArray);
        System.out.println("Min value of array: " + minValue);

        // Local max значение.
        double localMaxValue = minMaxValuesArray.searchLocalMax(testArray);
        System.out.println("Local max value of array: " + localMaxValue);

        // Local min значение.
        double localMinValue = minMaxValuesArray.searchLocalMin(testArray);
        System.out.println("Local min value of array: " + localMinValue);

        /* Нахождение среднеарифметическое значение массива. */
        AverageArrayValues averageArrayValues = new AverageArrayValues();
        double averageArith = averageArrayValues.calcArithmeticalAverage(testArray);
        System.out.println("Arithmetical average value of array: " + averageArith);

        /* Нахождение среднегеометрическое значение массива.*/
        double averageGeom = averageArrayValues.calcGeometricalAverage(testArray);
        System.out.println("Geometrical average value of array: " + averageGeom);

        /* Транспонирование квадратной матрицы. */
        double[][] testMatrix1 = {{3.5, 75.3, 23.8, 7.3},
                                  {23.5, 17.5, 98.4, 2.8},
                                  {56.8, 13.4, 1.6, 83.1},
                                  {18.0, 72.2, 99.4, 22.8}};
        MatrixTransposition transposition = new MatrixTransposition();
        printArray(transposition.transposeMatrix(testMatrix1));

        /* Транспонирование прямоугольной матрицы. */
        double[][] testMatrix2 = {{45.0, 32.7, 23.9, 63.1, 43.3},
                                  {21.3, 96.4, 86.0, 43.9, 60.0},
                                  {44.4, 7.9, 53.8, 34.8, 79.1}};
        printArray(transposition.transposeMatrix(testMatrix2));
    }

    private void printArray(double[][] array) {
        for (double[] arr : array)
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
