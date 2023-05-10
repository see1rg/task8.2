package org.example;

public class Main {
    //является ли слово палиндромом
    public static void main(String[] args) {
        String str = "aBcdaaadcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        boolean check = true;
        int j = charArray.length - 1;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[j]) {
                check = false;
                break;
            }
            j--;
        }
        return check;
    }
}