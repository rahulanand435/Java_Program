package Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Unionoftwoarrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4};
        int[] b =  {3, 4 ,5 , 6};
        int n = a.length;
        int m = b.length;
      System.out.println(Arrays.toString(union1(a,b,n,m)));
//        System.out.println(union(a,b,n,m));
//        union1(a,b,n,m);
    }
    static int[] union1(int[] a,int[] b,int n, int m){
        int x = 0;
        int i = 0,j=0;
        int[] c = new int[m + n];
        while(i < n && j < m){
            if(a[i] < b[j]){
                c[x++] = a[i++];
            }else if (a[i] > b[j])
                c[x++] = b[j++];
            else {
                c[x] = a[i];
                while(i < n && a[i] == c[x]){
                    i++;
                }
                while(j < m && b[j] == c[x]){
                    j++;
                }
                x++;
            }
        }
        while (i < n){
            c[x++] = a[i++];
        }
        while(j < m){
            c[x++] = b[j++];
        }
        return c;
    }
    static Integer union(int[] a,int[] b,int n, int m){
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(a[i]);
        }
        for (int j = 0; j < m; j++) {
            s.add(b[j]);
        }
        return s.size();
    }
    static int unionArray(int[] a,int[] b,int n, int m){
        int i = 0;
        int j = 0;
        int count = 0;
        for( i = 0;i < n;i++){
            for (j = 0;j < m;j++){
                if (a[i] == b[j]){
                    count++;
                }
            }
        }
        return m + n - count;
    }
}
