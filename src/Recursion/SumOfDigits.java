package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }
    static int sum(int n){
        if (n == 0){     //for digit multiplication base condition if(n%10 == n) return n;
            return 0;
        }
        //for product just follow same process and instead of adding just multiply the return value
        return (n % 10) + sum(n/10);
    }
}
