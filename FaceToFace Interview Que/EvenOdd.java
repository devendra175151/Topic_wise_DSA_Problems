package com.example.devendra.freqAsk30Que;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 53436;
        int oCnt = 0;
        int eCnt = 0;
        while (n > 0){
            int rem = n % 10;
            if(rem % 2 == 0){
                eCnt++;
            }else {
                oCnt++;
            }
            n /= 10;
        }
        System.out.println("odd digits are : " + oCnt + " Even coint is : " + eCnt);
    }
}
