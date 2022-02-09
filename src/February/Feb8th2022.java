package February;

import java.util.EnumSet;

public class Feb8th2022 {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    static int addDigits(int num) {
        if (num <= 9) return num;
        return num % 9 == 0 ? 9 : num % 9;
    }
}
