package com.codewars.invertvalues;

import java.util.Arrays;

import static java.lang.System.out;

public class TestApp {
    public static void main(String[] args) {
        out.println(Arrays.toString(Kata.invert(new int[]{1, 2, 3, 4})));
        out.println(Arrays.toString(Kata.invert(new int[]{-1, 2, -3, 4, -5})));
    }
}
