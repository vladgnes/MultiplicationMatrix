import java.util.Scanner;

/**
 * Created by vlad on 12.07.2016.
 */
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Matrix firstMatrix = new Matrix(n);
        Matrix secondMatrix = new Matrix(n);
        Matrix resultMatrix = new Matrix(n);
        firstMatrix.randomFilling();
        secondMatrix.randomFilling();
        resultMatrix = MatrixSingleThreadProcessor.multiplication(firstMatrix,secondMatrix);
        System.out.println(MatrixSingleThreadProcessor.comparison(firstMatrix,secondMatrix));
    }
}
