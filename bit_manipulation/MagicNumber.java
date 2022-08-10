package com.example.devendra.bit;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int ans = findMagicNum(n);
        System.out.println(ans);
    }
    static int findMagicNum(int n){
        int answer = 0;
        int base = 5;
        while (n != 0){
            int last = n & 1;
            n = n >> 1;
            answer = answer + last * base;
            base = base * 5;

        }
        return answer;
    }
}

