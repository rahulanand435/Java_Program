package Recursion;

public class Fibonassi {
    //1 1 2 3 5
    public static void main(String[] args) {

        System.out.println(fib(4));
    }

    static void fibofor(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
//        System.out.print(c + " ");
        }

    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return (fib(n - 1) + fib(n - 2));
    }
}