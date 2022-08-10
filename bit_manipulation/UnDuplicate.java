package com.example.devendra.bit;

public class UnDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,3,5,5,9,9,6,6};
        int[] arr2 = {-2,2,-3,4,3,-5,5,-9,9,-6,6};
        int ans1 = finUnduplicate(arr);
        int ans2 = find(arr2);
        System.out.println(ans1);
    }

    private static int finUnduplicate(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = answer ^ arr[i];
        }
        return answer;
    }
    static int find(int[] arr2){
        int ans = 0;
        for (int i = 0; i < arr2.length; i++) {
            ans = ans + arr2[i];
        }
        return  ans;
    }



}
