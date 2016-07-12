import java.util.Random;
import java.util.Scanner;

/**
 * Created by vlad on 12.07.2016.
 */
public class Main {
    public static void main(String [] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double [][] firstMatrix = new double[n][n];
        double [][] secondMatrix = new double[n][n];
        double [][] resultMatrix = new double[n][n];
        for(int i = 0;i < n;i++){
           for(int j = 0;j < n;j++){
               firstMatrix[i][j] = random.nextDouble();
               secondMatrix[i][j] = random.nextDouble();
           }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                for(int a = 0;a < n;a++){
                    resultMatrix[i][j] += firstMatrix[i][a] * secondMatrix[a][j];
                }
            }
        }
        boolean flag = false;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(firstMatrix[i][j] != secondMatrix[i][j]){
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("Matrices are equal");
        }else {
            System.out.println("Matrices are not equal");
        }



    }
}
