package com.example.devendra.freqAsk30Que;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a is " +a+ " b is"+b);
//        int temp = a;
//        a = b;
//        b = temp;


        // way 2
//        a = a + b; // 10 + 20
//        b = a - b; // 30 - 20 = 10
//        a = a - b; // 30 - 10 = 20

        // way 3
//          a = a*b;// 200
//          b = a/b;// 200/20 = 10
//          a = a/b;// 200/10 = 20

        // way 4
//        a = a ^ b; // a = 1010 b = 10100 == 11110  xor table 0 0 = 1, 0 1 = 0, 1 0 = 0, 1 1 = 1
//        b = a ^ b;
//        a = a ^ b;

        // way 5
         b = a + b- (a=b);
        System.out.println("After swap a "+ a + " b is " + b);
    }

}
