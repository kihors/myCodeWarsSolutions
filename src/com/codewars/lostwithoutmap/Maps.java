package com.codewars.lostwithoutmap;

import java.util.Arrays;

class Maps {
    static int[] map(int[] arr) {
        return Arrays.stream(arr).map(v -> v * 2).toArray();
        /*
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
        */
    }
}
