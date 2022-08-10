package com.example.devendra.freqAsk30Que;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scn.nextInt();

//        int rev = 0;
//        while (n > 0){
//            int rem = n % 10;
//            rev = rev * 10 + rem;
//            n /= 10;
//        }

        // using stringBufferClass method
//
//        StringBuffer rev;
//
//        StringBuffer sb = new StringBuffer(String.valueOf(n));
//        rev = sb.reverse();


        StringBuilder sbl = new StringBuilder();
        sbl.append(n);
        StringBuilder rev = sbl.reverse();

        System.out.println(rev);
    }
}
