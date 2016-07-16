import java.util.Random;

/**
 * Created by vlad on 16.07.2016.
 */
public class Matrix {
    private double[][] table;
    private int size;

    public Matrix(int n) {
        this.size = n;
        table = new double[size][size];
    }
    public void randomFilling() {
        Random random = new Random();
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                table[i][j] = random.nextDouble();
            }
        }
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void setTable(double[][] table){
        this.table = table;
    }

    public double[][] getTable(){
        return table;
    }
}



