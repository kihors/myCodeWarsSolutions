package com.codewars.evennumbers;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(EvenNumbers.divisibleBy(new int[] {1, 2, 3, 4, 5, 6}, 2)));
        System.out.println(Arrays.toString(EvenNumbers.divisibleBy(new int[] {0, 1, 2, 3, 4, 5, 6},4)));
    }
}
