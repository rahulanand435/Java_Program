package Recursion;

public class First {
    public static void main(String[] args) {
//        for(int i = 0;i < 6; i++){
//            System.out.println("rahul");
        fun(6);
        }

    static void fun(int n){
        if (n == 0){
            return;
        }
       fun(n - 1);
        System.out.println(n);
//        fun(n - 1);
    }
}
