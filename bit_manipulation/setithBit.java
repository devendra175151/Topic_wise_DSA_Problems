package com.example.devendra.bit;

public class setithBit {
    public static void main(String[] args) {
        int n = 5;
        int k = 4;
        int ans = setBit(n, k);
        System.out.println(ans);
    }

    static int setBit(int n, int k){
        return n | (1 << (k-1));
    }
}
