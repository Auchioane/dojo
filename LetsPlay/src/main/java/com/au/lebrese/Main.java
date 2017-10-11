package com.au.lebrese;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main() {
        ChessBoard board = new ChessBoard();
        board.start();
    }

    public static int penny(int n) {

        int totalAmount = 0;

        for (int i = 1; i <= n; i++) {

            totalAmount = totalAmount + (i * 5);

            }

        return totalAmount;
    }

    public static void eightQueens() {
        ChessBoard board = new ChessBoard();
        board.start();
    }
}
