package Recursion;

public class Print {
    public static void main(String[] args) {
     printforward(5);
    }
    static int print(int n){
        if(n == 0) return  1;
        System.out.print(n + " ");
        return print(n - 1);
    }
    static void printforward(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printforward(n-1);
        System.out.println(n);
    }
}
