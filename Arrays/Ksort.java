package com.example.devendra.array;

import java.util.Arrays;

public class Ksort {
    public static void main(String[] args) {
        int[] arr = { 4,1,7,3,9,2,8};
        int k = 3;
        sort(arr , k);
        System.out.println(Arrays.toString(arr));
    }

    public  static void  sort(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1 ; j < k; j++) {
                int temp = 0;
                if(arr[j] < arr[i]){
                    temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = k; i < arr.length; i++) {
            for (int j = i + 1 ; j < arr.length; j++) {
                int temp = 0;
                if(arr[j] > arr[i]){
                    temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

    }
}
