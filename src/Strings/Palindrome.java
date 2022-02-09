package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abcdcba";
        System.out.println(palindrome1(s));
    }
    static boolean palindrome1(String p){
        int i = 0;
        int j = p.length() - 1;
        while(i <= j){
            if(p.charAt(i) != p.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static void palindrome(String s){
        StringBuilder sp = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
                sp.append(s.charAt(i));
            }
          if (sp.toString().equals(s)){
              System.out.println("it is a palindrome.");
          }else {
              System.out.println("it is not a palindrome.");
          }
         }
        }


