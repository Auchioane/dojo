package com.au.lebrese;

import java.util.ArrayList;

public class BinaryGap {

    public static int binaryGap(int inputInt) {
        //Convert int to binary string
        String binaryInt = Integer.toBinaryString(inputInt);
        int lengthOfBinary = binaryInt.length();
        int gap = 0;
        int consecutiveGap = 0;
        int largestGap = 0;
        ArrayList<Integer> gapArray = new ArrayList<Integer>();

        for (int i= 1;  i < lengthOfBinary; i++ ) {
            gap = 0;
            char leftBit = ' ';
            char rightBit = ' ';
            char middleBit = ' ';

            middleBit = binaryInt.charAt(i);
            leftBit = binaryInt.charAt(i - 1);
            if (i != lengthOfBinary - 1) {
                rightBit = binaryInt.charAt(i + 1);
            }

            if (leftBit == '1' && middleBit == '0' && rightBit == '1') {
                gap++;
                gapArray.add(gap);
            } else if (leftBit == '1' && middleBit == '0' && rightBit == '0') {
                consecutiveGap++;
            } else if (consecutiveGap > 0 && rightBit == '0') {
                consecutiveGap++;
            } else if (consecutiveGap > 0 && rightBit == '1') {
                consecutiveGap++;
                gap = consecutiveGap;
                gapArray.add(gap);
                consecutiveGap = 0;
            }
        }
        for (int currentInt : gapArray) {
            if (currentInt > largestGap) {
                largestGap = currentInt;
            }
        }

        return largestGap;
    }
}
