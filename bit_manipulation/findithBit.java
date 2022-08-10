package com.example.devendra.bit;

public class findithBit {
    public static void main(String[] args) {
        int n = 8;
        int k = 4;
        int ans = findibit(n ,k);
        System.out.println(ans);
    }
    static int findibit(int n, int k ){
        return n&(1<<(k-1));
    }
}
