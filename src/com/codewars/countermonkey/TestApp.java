package com.codewars.countermonkey;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MonkeyCounter.monkeyCount(10)));
        System.out.println(Arrays.toString(MonkeyCounter.monkeyCount(5)));
        System.out.println(Arrays.toString(MonkeyCounter.monkeyCount(15)));
    }
}
