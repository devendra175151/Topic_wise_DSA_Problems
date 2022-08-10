package com.example.devendra.freqAsk30Que;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        int original_num = n;
        int rev = 0;
        while (n > 0){
            int rem = n % 10;
            rev  = rev * 10 + rem;
            n /=10;
        }
        if(rev == original_num){
            System.out.println("Yes");
        }else {
            System.out.println("Not");
        }
    }
}
