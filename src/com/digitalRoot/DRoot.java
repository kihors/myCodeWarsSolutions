package com.digitalRoot;

class DRoot {
    static int digital_root(int n) {
        if (n != 0 && n % 9 == 0) {
            return 9;
        } else {
            return n % 9;
        }
    }
}
