package com.codewars.evennumbers;

import java.util.Arrays;

class EvenNumbers {
    static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(v -> v % divider == 0).toArray();
//        int[] result = new int[numbers.length];
//        int count = 0;
//        for (int number : numbers) {
//            if (number % divider == 0) {
//                result[count] = number;
//                count++;
//            }
//        }
//        return Arrays.copyOf(result, count);
    }
}
