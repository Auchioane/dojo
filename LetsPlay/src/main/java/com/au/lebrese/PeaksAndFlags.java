package com.au.lebrese;

import java.util.ArrayList;

public class PeaksAndFlags {

    public int peaksAndFlags(int[] A) {
        //find the peaks
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        peaks = findPeaks(A);
        int maxFlags = 0;

/*        if (peaks.size() == 0)
        {
            maxFlags = 0;
        }
        if (peaks.size() == 2);
        {
            maxFlags = 2;
        }*/
        if (peaks.size()>0) {
            int peaksLeft = peaks.size();
            while (peaksLeft > 0) {
                for (int i = 0; i < peaks.size(); i++) {
                    int currentPeak = peaks.get(i);
                    int nextPeak = peaks.get((peaksLeft != 0) ? i + 1 : 0);

                    int flagDistance = (int) Math.abs(currentPeak - nextPeak);
                    if (flagDistance >= peaks.size()) {
                        maxFlags++;
                    }
                    peaksLeft--;
                }
            }
        }

        return maxFlags;
    }


    public static ArrayList<Integer> findPeaks(int[] mountainRange) {
        int lengthOfMountainRange = mountainRange.length;
        ArrayList<Integer> peaks = new ArrayList<Integer>();

        //Traverse the mountain and compare left and right to determine peak location
        for (int currentMountainPoint = 1; currentMountainPoint < lengthOfMountainRange; currentMountainPoint++) {
            int rightMOuntainRange = currentMountainPoint;
            int leftMountainPoint = mountainRange[currentMountainPoint - 1];
            int currentLocation = mountainRange[currentMountainPoint];
            if (currentMountainPoint != lengthOfMountainRange - 1)
            {
                rightMOuntainRange = mountainRange[currentMountainPoint + 1];
            }

            if (leftMountainPoint < currentLocation && rightMOuntainRange < currentLocation) {
                peaks.add(currentMountainPoint);
            }
        }

        return peaks;
    }
}
