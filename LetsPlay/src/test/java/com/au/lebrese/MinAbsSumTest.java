package com.au.lebrese;

import org.junit.jupiter.api.Test;

import static com.au.lebrese.MinAbsSum.*;
import static org.junit.jupiter.api.Assertions.*;

class MinAbsSumTest {

    @Test
    void shouldReturnAbsoluteSumOfZeroForGivenArray() {
        //given
        int sumArray[] = new int[]{1,5,2,-2};
        int expectedResult = 0;
        int actualResult;

        //when
        actualResult = absMinSum(sumArray);

        //then
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldReturnAbsoluteSumOfZeroForArrayWithMoreNegatives() {
        //given
        int sumArray[] = new int[]{-5,-7,7,9,11,-55};
        int expectedResult = 0;
        int actualResult;

        //when
        actualResult = absMinSum(sumArray);

        //then
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldReturnAbsoluteSumOfZeroForEmptyArray() {
        //given
        int sumArray[] = new int[]{};
        int expectedResult = 0;
        int actualResult;

        //when
        actualResult = absMinSum(sumArray);

        //then
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldReturnAbsoluteSumOfZ2ForArray() {
        //given
        int sumArray[] = new int[]{3, 1};
        int expectedResult = 2;
        int actualResult;

        //when
        actualResult = absMinSum(sumArray);

        //then
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldReturnMax15ForGivenArray() {
        //given
        int sumArray[] = new int[]{5,4,3,2,1};
        int expectedResult = 15;
        int actualResult;

        //when
        actualResult = maxSum(sumArray);

        //then
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldReturnMax0ForGivenArray() {
        //given
        int sumArray[] = new int[]{-1,5,-2,-2};
        int expectedResult = 0;
        int actualResult;

        //when
        actualResult = maxSum(sumArray);

        //then
        assertEquals(expectedResult, actualResult);

    }


    @Test
    void shouldReturnMin1ForGivenArray() {
        //given
        int sumArray[] = new int[]{1,2,3,4,5};
        int expectedResult = 1;
        int actualResult;

        //when
        actualResult = minSum(sumArray);

        //then
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldReturnMin6ForGivenArray() {
        //given
        int sumArray[] = new int[]{6,-55,23,7,9};
        int expectedResult = 1;
        int actualResult;

        //when
        actualResult = minSum(sumArray);

        //then
        assertEquals(expectedResult, actualResult);

    }

}