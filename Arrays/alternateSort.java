package com.example.devendra.array;

import java.util.Arrays;

public class alternateSort {

    public static void main(String[] args) {
        int[] arr = {4,2,5,3,7};
        int[] ansarr = sort(arr);
        System.out.println(Arrays.toString(ansarr));
    }
    static int[] sort(int[] arr){
        Arrays.sort(arr);
        int[] ans = new int[arr.length/2 + 1 ];
        int k = 0;
        for (int i = 0; i <= arr.length; i++) {
            if(i % 2 == 0){
                ans[k++] = arr[i];
            }
        }
        return ans;
    }
}
