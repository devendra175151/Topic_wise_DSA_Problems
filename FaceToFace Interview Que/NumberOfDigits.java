package com.example.devendra.freqAsk30Que;

public class NumberOfDigits {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
