package com.nc.string;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        reverseSmallNumber(n);
        reverseBigNumber(n);
    }

    private static void reverseBigNumber(int n) {
        // WIP
    }

    private static void reverseSmallNumber(int n) {
        int res = 0;
        while (n > 0) {
            int rem = n % 10; //last digit
            res = res * 10; //multiply by 10 to answer
            res = res + rem; //add last digit to result
            n = n / 10; //leave last digit
        }
        System.out.println(res);
    }
}
