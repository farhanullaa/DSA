package com.programming.techie.Recursion;

public class FibonacciNumber {
    private static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i));
        }
    }
}
