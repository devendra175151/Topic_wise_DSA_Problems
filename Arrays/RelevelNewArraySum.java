package com.example.devendra.array;

public class RelevelNewArraySum {
    public static void main(String[] args) {
        int n = 3;
        int[] arrA = {4,9,8};
        int ans = findSumOfNewArray(n, arrA);
        System.out.println(ans);
    }
    static int findSumOfNewArray( int n, int[] arrA){
        int[] arrB = new int[n];
        int[] arrACopy = new int[n];
        for (int k = 0; k < arrA.length; k++) {
                arrACopy[k] = arrA[k];
        }
        for (int i = 0; i < arrA.length; i++) {

            for (int x = 0; x < arrA.length; x++) {

            }
            int j = 0;
            int cnt = 0;
            if(arrB[j] > arrA[i]){
                break;
            }
            while (arrA[i] > 0 && arrA[i] >= j){

                if (arrB[j] < arrA[j] || cnt >= arrB.length){
                    arrB[j] = arrB[j] + 1;
                    arrA[i] = arrA[i] - 1;
                }else {
                    break;
                }
                if(arrA[i] > 0 && j == arrB.length-1){
                    j = 0;
                    cnt++;
                }else {
                    j++;
                    cnt++;
                }
            }
        }
        int sum = 0;
        for (int k = 0; k < arrB.length; k++) {
            sum += arrB[k];
        }
        return sum;
    }

}
