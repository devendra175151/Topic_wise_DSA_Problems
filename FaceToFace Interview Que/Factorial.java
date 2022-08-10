package com.example.devendra.freqAsk30Que;

public class Factorial {
    public static void main(String[] args) {

        int n = 5;
        int fct = 1;
        for (int i = 1; i <= n; i++) {
            fct *= i;
        }
        System.out.println(fct);
    }
}
