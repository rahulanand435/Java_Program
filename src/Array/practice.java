package Array;

public class practice {
    public static void main(String[] args) {
        int[][] a = {{1, 1},
                     {1, 1}};

        int[][] b = {{1,2},
                     {2,2}};
        multiplication(a,b);
    }
    static int[][] multiplication(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b[0].length; j++){
                c[i][j] =0;
                for (int k = 0 ;k <a[0].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }for (int[] arr:c){
            for(int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        return  c;
    }
}
