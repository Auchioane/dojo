package com.au.lebrese;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneAndSwap {

    public static int task1(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        int maxOccurence = 0;
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] >= 0) {
                int tmp = count[A[i]];
                if (tmp >= maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        return A[index];
    }

    public static String task3(String S, String T) {
        // write your code in Java SE 8
        int sLength = S.length();
        int tLength = T.length();
        char characterModifier = ' ';

        String action = " ";

        if (sLength >= (tLength + 2) || tLength >= (sLength +2)) {
            action = "IMPOSSIBLE";
        } else if (tLength > sLength) {
            //We will need to insert something maybe
            action = "INSERT ";
            for (int i = 0; i < sLength; i++) {
                char currentSCharacter = S.charAt(i);
                char currentTCharacter = T.charAt(i);
                if (currentSCharacter != currentTCharacter) {
                    characterModifier = currentTCharacter;
                    break;
                }
            }
            action += characterModifier;
        } else if (tLength < sLength) {
            //we will need to remove something maybe

            action = "DELETE ";
            for (int i = 0; i < tLength; i++) {
                char currentSCharacter = S.charAt(i);
                char currentTCharacter = T.charAt(i);
                if (currentSCharacter != currentTCharacter) {
                    characterModifier = currentSCharacter;
                    break;
                }
            }

            action += characterModifier;
        } else {
            //swap something as each are equal length
            //What if they are the same length but totally different words and swap cant happen??

            action = "SWAP ";
            for (int i = 0; i < sLength; i++) {
                char currentSCharacter = S.charAt(i);
                char currentTCharacter = T.charAt(i);
                char nextSCharacter = S.charAt(i+1);
                if (currentSCharacter != currentTCharacter) {
                    action += currentSCharacter;
                    action += " ";
                    action += nextSCharacter;
                    break;
                }
            }
        }

        for (int i = 0; i < sLength; i++) {

        }

        return action;
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        //parse string
        String calls[] = S.split("\\r?\\n");
        Map<String, String> mapOfCalls = new HashMap<>();
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        for (int i = 0; i < calls.length; i++) {
            String call[] = S.split("\\s*,\\s*");
            mapOfCalls.put(calls[1], calls[0]);
        }

        Iterator it = mapOfCalls.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry call = (Map.Entry)it.next();
            String durationOfCall = call.getValue().toString();
            String time[] = durationOfCall.split(":");
            hours += Integer.parseInt(time[0]);
            minutes += Integer.parseInt(time[0]);
            seconds += Integer.parseInt(time[0]);
        }

        //calculate all time


        return 0;
    }
}
