package com.codewars.fakebinary;

class FakeBinary {
    static String fakeBin(String numberString) {
//        String[] intStr = numberString.split("");
//        int[] numStr = new int[intStr.length];
//        for (int i = 0; i < numStr.length; i++) {
//            numStr[i] = Integer.parseInt(intStr[i]);
//        }
//        for (int i = 0; i < numStr.length; i++) {
//            if (numStr[i] < 5) {
//                numStr[i] = 0;
//            } else if (numStr[i] >= 5) {
//                numStr[i] = 1;
//            }
//        }
//        numberString = Arrays.toString(numStr).replaceAll("\\[|\\]|,|\\s", "");
//        return numberString;

        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
