package Array;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 1},
                     {1, 1}};

        int[][] b = {{1,2},
                     {2,2}};
        int[][] c = multiply(a, b);
        display(c);
        }
    static int[][] multiply(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];
        if (a[0].length == b.length){
            for (int i = 0;i < a.length; i++){
                for (int j = 0;j < b[0].length; j++){
                    c[i][j] = 0;
                    for (int k = 0;k <a[0].length;k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        return c;
    }

    static void display(int[][] mat) {
        for(int[] row : mat) {
            for(int col: row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
