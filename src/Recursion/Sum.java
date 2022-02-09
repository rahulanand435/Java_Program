package Recursion;

public class Sum {
    public static void main(String[] args) {
        int p = sum1(4);
        System.out.println(p);
    }
    static int sum(){
        int sum = 0;
        for (int i = 0; i <= 10;i++){
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }
    static int sum1(int n){
        if (n == 1){
            return n;
        }
        return n + sum1(n - 1);
    }
}
