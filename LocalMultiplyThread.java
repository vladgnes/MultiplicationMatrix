/**
 * Created by vlad on 17.07.2016.
 */
public class LocalMultiplyThread extends Thread {
    double[][] resultTable;
    double[][] firstTable;
    double[][] secondTable;
    int size, firstIndex, lastIndex;
    public LocalMultiplyThread(Matrix firstMultiplierMatrix, Matrix secondMultiplierMatrix, Matrix resultMatrix, int firstIndex, int lastIndex ){
        this.resultTable = resultMatrix.getTable();
        this.firstTable = firstMultiplierMatrix.getTable();
        this.secondTable = secondMultiplierMatrix.getTable();
        this.size = firstMultiplierMatrix.getSize();
        this.firstIndex = firstIndex;
        this.lastIndex = lastIndex;
        start();
    }

    public void run(){
        for (int index = firstIndex; index < lastIndex; index++) {
            calculateValue(index/size, index%size);
        }
    }
    public void calculateValue(int i, int j){
        int sum = 0;
        for (int a = 0; a < size ; a++)
            sum += firstTable[i][a] * secondTable[a][j];
        resultTable[i][j] = sum;
    }

}
