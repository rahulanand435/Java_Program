package LoopPattern;

public class Patterns {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1 ;j <= n;j++){
                if (i == 1 || i == n){
                    System.out.print("*");
                }
                if (j == 2 && j < n){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    static void pattern30(int n){
        for (int i = 1;i <= n; i++){
            int space = n - i;
            for (int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--){
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int i = 1;i <= 2 * n - 1;i++){
            int col = i > n ? 2 * n - i :i;

            int spaces =n - col;
            for (int s = 0;s < spaces;s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 1;i <= 2 * n - 1;i++){
            int col = i > n ? 2 * n - i :i;
            for (int j = 1; j <= col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1;i <= n;i++){
            for (int j = 1; j <= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1;i <= n;i++){
            for (int j = 1; j <= n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int i = 0; i <= n; i++){
            for (int j = 0 ;j <= n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern2(int n){
        for (int i = 0 ;i <= n; i++){
            for (int j = 0; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
