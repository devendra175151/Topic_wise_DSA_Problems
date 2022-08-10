package com.example.devendra.freqAsk30Que;

public class DuplicatesInarray {
    public static void main(String[] args) {

        String[] arr = {"java", "a", "abs", "java"};
        boolean bool = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    bool = true;

                }
            }
        }
        if(!bool){
            System.out.println("No duplivcate");

        }else {
            System.out.println("Duplicate contains");
        }

    }
}
