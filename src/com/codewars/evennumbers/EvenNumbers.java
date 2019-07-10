package com.codewars.evennumbers;

import java.util.Arrays;

class EvenNumbers {
    static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(v -> v % divider == 0).toArray();
//        int[] result = new int[numbers[divider]];
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % divider == 0) {
//                result[count] = numbers[i];
//                count++;
//            }
//        }
//        return result;
    }
}
