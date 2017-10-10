package com.au.lebrese;

public class MinAbsSum {

    public static int maxSum(int[] A) {
        int maxEndingHere = A[0];
        int maxSoFar = A[0];

        for (int i = 1; i < A.length; i++ ) {
            maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static int minSum(int[] A) {
        int minEndingHere = A[0];
        int minSoFar = A[0];

        for (int i = 1; i < A.length; i++ ) {
            minEndingHere = Math.min(A[i], minEndingHere + A[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }

        return minSoFar;
    }

    public static int sumArray(int[] A) {
        int min = 2 * 200000 + 1;
        for (int i = 1; i < A.length; i++) {
            int dif = Math.abs(A[i] - A[i - 1]);
            if (dif < min) {
                min = dif;
            }
        }
        return min;
    }

    public static int absMinSum(int[] A) {
        int[] invertedArray = new int[A.length];
        if (A.length != 0) {
            invertedArray[0] = (A[0] * (-1));

            for (int i = 1; i < A.length; i++) {
                if (i % 2 == 0) {
                    invertedArray[i] = (A[i] * -1);
                } else {
                    invertedArray[i] = A[i];
                }
            }

            return sumArray(invertedArray);
        }

        return 0;
    }

}
