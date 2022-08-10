package com.example.devendra.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class maxOccured {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,2,3,5,6};
        findOccurenceCount(arr);
    }

//    static void findOccurenceCount(int[] arr){
//        int maxCount = 0;
//        int element = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//
//            }
//            if(maxCount<count){
//                maxCount=count;
//                element = arr[i];
//            }
//        }
//
//        System.out.println(element + " occured " + maxCount + " times ");
//    }

    // using sorting

    static void  findOccurenceCount(int[] arr){
        Arrays.sort(arr);
        int count = 1;
        int maxCount  = 1;
        int maxCountElement = 0;
        int currenElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(currenElement == arr[i]){
                count++;
            }else{
                if(count > maxCount){
                    maxCount = count;
                    maxCountElement = currenElement;
                }
                currenElement = arr[i];
                count = 1;
            }
        }

        System.out.println(maxCountElement + " ocured " + maxCount + " times ");


    }
}
