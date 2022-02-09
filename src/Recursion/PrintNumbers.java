package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        print2(5);
    }
    static void print1(int n){
        if (n == 0){
            return;
        }
        print1(n-1);
        System.out.println(n);
    }
    static  void print2(int n){
        if(n < 1){
            return;
        }
        System.out.print(n + " ");
        print2(n-1);
        System.out.print(n + " ");
    }

}
