package com.example.devendra.array;

import java.util.Arrays;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for (int[] row : arr){
            for (int i = 0; i < (arr[0].length+1)/2; i++) {
                int temp = row[i];
                row[i] = row[arr[0].length-i-1];
                row[arr[0].length-i-1] = temp;
            }
        }
        for (int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(Arrays.toString(arr[j]));
            }
        }
    }
}
