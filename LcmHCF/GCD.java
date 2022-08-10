package com.example.devendra.lcmhcf;


public class GCD {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 12;
        int ans = findGcd(num1, num2);
        System.out.println(ans);
    }

    static int findGcd(int num1, int num2){
        int ans = 1;
        for (int i = 1; i < Largest(num1, num2); i++) {
            if(num1 % i == 0 && num2 % i == 0){
                ans = i;
            }
        }
        return ans;
    }

    static int Largest(int num1, int num2){
        return (num1>num2)?num1 : num2;
    }

}
