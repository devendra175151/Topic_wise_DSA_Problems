package com.example.devendra.freqAsk30Que;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 233;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }

        System.out.println(sum);
    }
}
