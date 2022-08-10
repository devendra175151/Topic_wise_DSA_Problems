package com.example.devendra.array;

// leetcode 1395
public class CountTeams {
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        int ans = count(arr);
        System.out.println(ans);
    }

    static int count(int[] arr){
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(arr[i] < arr[j] && arr[j] < arr[k]){
                        cnt++;
                    } else if (arr[i] > arr[j] && arr[j] > arr[k]) {
                        cnt++;
                    }
                }

            }

        }
        return cnt;
    }
}
