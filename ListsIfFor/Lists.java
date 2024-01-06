package java_basics.ListsIfFor;

import java.util.Arrays;

public class Lists {
    public static void main(String[] args){
        String a = "a";
        System.out.println(a);
        int[][] numbers = {{1,2}, {1,2,3}};
        int[][] numbers2 = {{1,2},{3,4}};
        System.out.print(isPalindrome("abba!!"));

    }
    public static boolean isPalindrome(String text){
        String textSt = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String textReverse = new StringBuilder(textSt).reverse().toString();
        return textSt.equals(textReverse);
    }
}
