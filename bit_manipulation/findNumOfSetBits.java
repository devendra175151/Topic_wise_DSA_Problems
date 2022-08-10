package com.example.devendra.bit;

public class findNumOfSetBits {
    public static void main(String[] args) {
        int n = 7;
        int ans = findNumOfSetBitss(n);
        System.out.println(ans);
    }
    static int findNumOfSetBitss(int n){
        int cnt = 0;
        while (n > 0){
            if((n & 1) == 1){
                cnt++;

            }
            n = n >> 1;
        }
        return cnt;
    }
}
