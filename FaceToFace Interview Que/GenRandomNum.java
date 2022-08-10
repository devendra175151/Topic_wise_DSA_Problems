package com.example.devendra.freqAsk30Que;

import java.util.Random;

public class GenRandomNum {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rnd_num = rnd.nextInt(100);
        System.out.println(rnd_num);
    }
}
