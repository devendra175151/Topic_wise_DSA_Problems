package com.example.devendra.freqAsk30Que;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "mam";
        String original_str = str;
        int len = str.length();

        String rev = "";
        for (int i = len-1 ; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
        }

        if(rev.equals(original_str)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
