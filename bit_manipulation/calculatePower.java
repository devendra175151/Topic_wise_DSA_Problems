package com.example.devendra.bit;

public class calculatePower {
    public static void main(String[] args) {
        int base = 2;
        int dbase = base;
        int power = 3;
        int dpower = power;
        int ans = 1;
        while (power > 0){
            if ((power&1)==1){
                ans = ans * base;
            }
            base = base * base;
            power = power >> 1;

        }
        System.out.println(dbase+"^"+dpower+ "is :"+ans + " ");
    }
}
