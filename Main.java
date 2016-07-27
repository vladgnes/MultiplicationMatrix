import java.util.Scanner;

/**
 * Created by vlad on 12.07.2016.
 */
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Matrix firstMatrix = new Matrix(n);
        Matrix secondMatrix = new Matrix(n);
        Matrix resultMatrix = new Matrix(n);
        double[][] firstTable = firstMatrix.getTable();
        double[][] secondTable = secondMatrix.getTable();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.println("1 matrix");
                firstTable[i][j] = scanner.nextInt();
                System.out.println("2 matrix");
                secondTable[i][j] = scanner.nextInt();
            }
        }
        LocalMultiplyThread [] arr = new LocalMultiplyThread[k];
        int a = 0;
        int b = n*n/k;
        for(int i = 0;i < k-1;i++){
            arr[i] = new LocalMultiplyThread(firstMatrix,secondMatrix,resultMatrix,a,a+b);
            a++;
        }
        arr[k - 1] = new LocalMultiplyThread(firstMatrix,secondMatrix,resultMatrix,a,n+a);
    }
}
