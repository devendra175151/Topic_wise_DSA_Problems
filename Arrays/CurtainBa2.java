package com.example.devendra.array;

public class CurtainBa2 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,5,8,9,7,4,5,6,7,1};
        int k = 3;
        int ans = findMaxSum(arr, k);
        System.out.println(ans);
    }

    static int findMaxSum(int[] arr, int k){
        int max = 0, cnt = 0;
        for (int i = 0; i < arr.length ; i++) {

            if(i % k == 0){
                max = Math.max(max, cnt);
                cnt = 0;
            }
            cnt = cnt + arr[i];
        }
        max = Math.max(max,cnt);
        return max;
    }

}
