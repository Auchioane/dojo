package com.au.lebrese;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main() {
        // write your code here
    }

    public static int penny(int n) {

        int totalAmount = 0;

        for (int i = 1; i <= n; i++) {

            totalAmount = totalAmount + (i * 5);

            }

        return totalAmount;
    }
}
