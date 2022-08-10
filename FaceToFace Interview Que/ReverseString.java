package com.example.devendra.freqAsk30Que;

public class ReverseString {
    public static void main(String[] args) {
        // using concat

        String str = "abcd";
        String rev = "";
//        int len = str.length();
//        for (int i = len-1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }

        // way 2
//        char a[] = str.toCharArray();
//
//        for (int i = str.length() -1 ; i >= 0; i--) {
//            rev = rev + a[i];
//        }

        // way 3

        StringBuffer br = new StringBuffer(str);
        rev = String.valueOf(br.reverse());
        System.out.println(rev);

    }
}
