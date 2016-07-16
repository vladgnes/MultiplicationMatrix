/**
 * Created by vlad on 16.07.2016.
 */
public class MatrixSingleThreadProcessor {

    public static Matrix multiplication(Matrix firstMultiplierMatrix, Matrix secondMultiplierMatrix) {
        int size = firstMultiplierMatrix.getSize();
        Matrix resultMatrix = new Matrix(size);
        double[][] resultTable = resultMatrix.getTable();
        double[][] firstTable = firstMultiplierMatrix.getTable();
        double[][] secondTable = secondMultiplierMatrix.getTable();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int a = 0; a < size; a++) {
                    resultTable[i][j] += firstTable[i][a] * secondTable[a][j];
                }
            }
        }
        resultMatrix.setTable(resultTable);
        return resultMatrix;
    }

    public static boolean comparison(Matrix firstComparableMatrix, Matrix secondComparableMatrix) {
        boolean flag = false;
        int size = firstComparableMatrix.getSize();
        double[][] firstTable = firstComparableMatrix.getTable();
        double[][] secondTable = secondComparableMatrix.getTable();
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                if (firstTable[i][j] != secondTable[i][j]) {
                    flag = true;
                }
            }
        }
        return !flag;
    }
}
