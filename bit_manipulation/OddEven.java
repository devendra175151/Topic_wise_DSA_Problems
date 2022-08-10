package com.example.devendra.bit;

public class OddEven {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(iseven(n));
    }
    static boolean iseven(int n){
        return (n & 1) == 0;
    }
}
