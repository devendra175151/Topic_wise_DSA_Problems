package com.example.devendra.array;

//Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
//
//        Note : 1st element of the array should be considered in the count of the result.
//
//        For example,
//
//        Arr[]={7,4,8,2,9}
//
//        As 7 is the first element, it will consider in the result.
//
//        8 and 9 are also the elements that are greater than all of its previous elements.
//
//        Since total of  3 elements is present in the array that meets the condition.
//
//        Hence the output = 3.
public class PriporGreat {

    public static void main(String[] args) {
        int[] arr = {3,4,5,8,9};
        int ans = count(arr);
        System.out.println(ans);
    }

    static int count(int[] arr){
        int ans = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i]){
                ans++;
            }

        }
        return ans;
    }
}
