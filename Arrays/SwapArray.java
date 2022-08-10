package com.example.devendra.array;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = reverse(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
