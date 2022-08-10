package com.example.devendra.lcmhcf;

public class LCM {
    public static void main(String[] args) {
        int num1 = 288;
        int num2 = 12;
        int ans = findLcm(num1, num2);
        System.out.println(ans);
    }

    static int findLcm(int num1 , int num2){

        if(num1 == 1 && num2 ==1 ){
            return 1;
        }
//        int max = Math.max(num1,num2);
        int max = (num1 > num2) ? num1 : num2;
        int lcm = max;
        while (true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                return  lcm;
            }
            ++lcm;
        }
    }

}
