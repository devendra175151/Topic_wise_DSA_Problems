package com.example.devendra.array;
import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        String arr[]={"mon","tue,","wed","thu","fri","sat","sun"};
        int i=0;
        for(i=0;i< arr.length;i++)
            if(arr[i].equals(str))
                break;
        int res=1;
        int rem=6-i;
        n=n-rem;
        if(n >0)
            res+=n/7;
        System.out.println(res);
    }
}
