package Recursion;

public class CountNumberOfZeros {
    public static void main(String[] args) {
        int n = 3020400;
        System.out.println(zerorec(n));
    }
    static int zerorec(int n){
        return helper(n,0);
    }

     static int helper(int n, int c) {
        if(n == 0){
            return c;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10,c+1);
        }
            return  helper(n/10,c);
    }

    static int zero(int n) {
        int count = 0;
        while (n % 10 != n) {
            int rem = n % 10;
            if (rem == 0) {
                count++;
                n = n / 10;
            } else {
                n = n / 10;
            }
        }
        return count;
    }
}