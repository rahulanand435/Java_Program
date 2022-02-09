package Array;

public class Main {

    public static void main(String[] args) {
	    int num = 121;
        int temp = num;
        int num2 = 0;
        while(temp > 0) {
            int rem = temp % 10;
            num2 = num2 * 10 + rem;
            temp /= 10;
        }
        if(num == num2){
            System.out.printf("palindrome");
        } else {
            System.out.printf("Not palindrome");
        }
    }
}
