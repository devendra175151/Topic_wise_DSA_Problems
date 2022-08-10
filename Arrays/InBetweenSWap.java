package com.example.devendra.array;

import java.util.Arrays;

public class InBetweenSWap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int l = 1, r = 3;
        int[] ans = reverse(arr, l, r);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] reverse(int[] arr, int left, int right) {
        while (left < right){
            swap(arr, left,right);
            left++;
            right--;
        }
        return arr;
    }
    static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
