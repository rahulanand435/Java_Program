package Array;

public class array {
    public static void main(String[] args) {
        char[] ch = {'e','a' ,'d', 'a', 'a', 'b', 'b', 'z', 'b', 'c',};
        int[] temp = new int[26];

        for (int i = 0; i < ch.length; i++){
            if (temp[(int)ch[i] - 97] == 0){
                temp[(int)ch[i] - 97] = 1;
            }
        }
        for (int i = 0;i < temp.length ; i++){
            if (temp[i] == 1)
            {
                System.out.print((char) (97 + i) + " ");
            }
        }
    }
}
