package com.codewars.invertvalues;

import java.util.Arrays;

class Kata {
    static int[] invert(int[] array) {
        return Arrays.stream(array).map(v -> -v).toArray();
//        for (int i = 0; i < array.length; i++) {
//            array[i] *= -1;
//        }
//        return array;
    }
}
