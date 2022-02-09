package TwoPointer;
import java.util.ArrayList;

public class Findtheclosestpairfromtwoarrays {
    public static void main(String[] args) {
      int[]  arr = {1, 4, 5, 7};
      int[]  brr = {10, 20, 30, 40};
      int X = 32;
        System.out.println(n(arr,brr,4,4,X));
    }
    static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x){
        ArrayList<Integer> show = new ArrayList<> ();
        int i = 0;
        int p1 = 0,p2 =0;
        n = arr.length;
        m = brr.length;
        int j = m - 1;
        int min = Integer.MAX_VALUE;
        while(i < n && j >= 0){
           int y = arr[i] + brr[j];
           int z = Math.abs((x - y)) ;
           if (min > z){
               min = z;
                p1 = arr[i];
                p2 = brr[j];

        }if(y > x){
               j--;
           }
           else {
               i++;
            }
    }
        show.add(p1);
        show.add(p2);
        return  show;

}
static ArrayList<Integer> n(int arr[], int brr[], int n, int m, int x){
       ArrayList<Integer> nrr = new ArrayList<>();
        n = arr.length;
        m = brr.length;
        int y = Integer.MAX_VALUE;
        int i = 0;
        int j = m-1;
        int p1=0,p2=0;
        while(i < n && j >= 0){
            int z = arr[i] + brr[j];
            int a = Math.abs((x - z));
            if (y > a){
                y = a;
                p1 = arr[i];
                p2 = brr[j];
            }
            if (z > x){
                j--;
            }else
                i++;

        }
        nrr.add(p1);
        nrr.add(p2);
        return nrr;
    }
}