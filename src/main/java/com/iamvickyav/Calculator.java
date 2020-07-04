package com.iamvickyav;

public class Calculator {

    public int add(int...input) {
        int s = 0;

        for(int a : input) {
            s = s + a;
        }

        return s;
    }

    public int multiply(int...input) {
        int s = 1;

        for(int a: input) {
            s = s * a;
        }

        return s;
    }
}
