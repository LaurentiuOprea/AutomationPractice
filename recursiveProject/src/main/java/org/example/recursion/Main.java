package org.example.recursion;


public class Main {

    public static int sum(int k) {
        if (k > 0) {
            System.out.println("number: " + k);
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}