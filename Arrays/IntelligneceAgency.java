package com.example.devendra.array;

//An intelligence agency has received reports about some threats. The reports consist of numbers in a mysterious method. There is a number “N” and another number “R”. Those numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are summed up and this action is performed ‘R’ number of times. The resultant is also a single digit that is yet to be deciphered. The task here is to find the single-digit sum of the given number ‘N’ by repeating the action ‘R’ number of times.
//
//        If the value of ‘R’ is 0, print the output as ‘0’.
//
//        Example 1:
//
//        Input :
//
//        99 -> Value of N
//
//        3  -> Value of R
//
//        Output :
//
//        9  -> Possible ways to fill the cistern.
//
//        Explanation:
//
//        Here, the number N=99
//
//        Sum of the digits N: 9+9 = 18
//        Repeat step 2 ‘R’ times i.e. 3 tims  (9+9)+(9+9)+(9+9) = 18+18+18 =54
//        Add digits of 54 as we need a single digit 5+4
//        Hence , the output is 9.
public class IntelligneceAgency {
    public static void main(String[] args) {
        int n = 1234;
        int r = 2;
        int ans = find(n ,r);
        System.out.println(ans);
    }

    static int find(int n, int r){
        int ans = 0;
        while (n > 0){
            int rem = n % 10;
            ans = ans + rem;
            n = n / 10;
        }
        int newans = ans * r;
        int ans2 = 0;
        while (newans> 0){
            int rem = newans % 10;
            ans2 = ans2 + rem;
            newans = newans / 10;
        }
        return ans2;
    }

}
