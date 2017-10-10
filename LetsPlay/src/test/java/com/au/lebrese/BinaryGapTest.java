package com.au.lebrese;

import org.junit.jupiter.api.Test;

import static com.au.lebrese.BinaryGap.binaryGap;
import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {
    @Test
    void shouldHaveBinaryGapOf1Given20() {
        //given
        int positiveInteger =  20;
        int actualResult;
        int expected = 1;

        //when
        actualResult = binaryGap(positiveInteger);

        //then
        assertEquals(expected, actualResult);
    }

    @Test
    void shouldHaveBinaryGapOf5Given1041() {
        //given
        int positiveInteger =  1041;
        int expectedResult = 5;
        int actualResult;

        //when
        actualResult = binaryGap(positiveInteger);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldHaveBinaryGapOf2Given9() {
        //given
        int positiveInteger =  9;
        int expectedResult = 2;
        int actualResult;

        //when
        actualResult = binaryGap(positiveInteger);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldHaveBinaryGapOf0Given15() {
        //given
        int positiveInteger =  15;
        int expectedResult = 0;
        int actualResult;

        //when
        actualResult = binaryGap(positiveInteger);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldHaveBinaryGapOf0Given14() {
        //given
        int positiveInteger =  14;
        int expectedResult = 0;
        int actualResult;

        //when
        actualResult = binaryGap(positiveInteger);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldHaveBinaryGapOf1Given5() {
        //given
        int positiveInteger =  5;
        int expectedResult = 1;
        int actualResult;

        //when
        actualResult = binaryGap(positiveInteger);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldHaveBinaryGapOf1Given17425() {
        //given
        int positiveInteger =  17425;
        int expectedResult = 5;
        int actualResult;

        //when
        actualResult = binaryGap(positiveInteger);

        //then
        assertEquals(expectedResult, actualResult);
    }

}