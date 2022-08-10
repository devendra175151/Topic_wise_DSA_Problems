package com.example.devendra.array;

import java.util.ArrayList;

public class TCSKeepZeroToLast {
    public static void main(String[] args) {
        int[] arr = {6, 0, 1, 8, 0, 0};
        int n = arr.length;
//        Swap(arr,n);
        ArrayList<Integer> ans = arrange(arr, n);
        System.out.println(ans);
    }

    static void Swap(int[] arr, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                arr[cnt++] = arr[i];
            }
        }
        for (int i = cnt; i < n; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

        }

        // new approach
        static ArrayList<Integer> arrange(int[] arr, int n){
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if(arr[i] == 0){
                    cnt++;
                }
                if(arr[i] != 0){
                    list.add(arr[i]);
                }
            }
            for (int i = 0; i < cnt; i++) {
                list.add(0);
            }
            return list;
        }
}

