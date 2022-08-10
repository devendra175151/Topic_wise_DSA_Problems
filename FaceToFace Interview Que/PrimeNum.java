package com.example.devendra.freqAsk30Que;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 25;
        int cntFactors = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                cntFactors++;
            }
        }
        if(cntFactors==2){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
