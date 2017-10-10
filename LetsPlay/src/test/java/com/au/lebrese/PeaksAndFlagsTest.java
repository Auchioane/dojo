package com.au.lebrese;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.au.lebrese.PeaksAndFlags.findPeaks;
import static org.junit.jupiter.api.Assertions.*;

class PeaksAndFlagsTest {

    @Test
    void shouldHave4peaksforGivenArray() {
        //given
        int mountainRange[] = new int[]{1,5,3,4,3,4,1,2,3,4,6,2};
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(10);

        ArrayList<Integer> actualResult = new ArrayList<Integer>();

        //when
        actualResult = findPeaks(mountainRange);

        //then
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldHave3peaksforGivenArray() {
        //given
        int mountainRange[] = new int[]{1,5,3,4,3,4,1,2,3,4,6,2};
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(5);

        ArrayList<Integer> actualResult = new ArrayList<Integer>();

        //when
        actualResult = findPeaks(mountainRange);

        //then
        assertEquals(expectedResult, actualResult);

    }

}