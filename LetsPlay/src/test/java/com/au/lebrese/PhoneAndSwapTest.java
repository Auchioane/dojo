package com.au.lebrese;

import org.junit.jupiter.api.Test;

import static com.au.lebrese.PhoneAndSwap.*;
import static org.junit.jupiter.api.Assertions.*;

class PhoneAndSwapTest {

    @Test
    void shouldReturnHighestValue() {
        //given
        int inputArray[] = new int[]{1,2,3,3,1,3,1};
        int m = 3;
        int expectedResult = 3;
        int actualResult;

        //when
        actualResult = task1(m, inputArray);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnNotReturnHighestOccurance() {
        //given
        int inputArray[] = new int[]{1,2,3};
        int m = 3;
        int expectedResult = 3;
        int actualResult;

        //when
        actualResult = task1(m, inputArray);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnReturnHighestOccuranceof3() {
        //given
        int inputArray[] = new int[]{3};
        int m = 3;
        int expectedResult = 3;
        int actualResult;

        //when
        actualResult = task1(m, inputArray);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnHighestValueOfALargeArray() {
        //given
        int inputArray[] = new int[]{1,2,3,3,1,3,1,4,6,5,3,2,3,4,5,6,4,3,2,4,5,6,7,2,2,3,4,5,3};
        int m = 8;
        int expectedResult = 3;
        int actualResult;

        //when
        actualResult = task1(m, inputArray);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnInsertEForWordNice() {
        //Given
        String s = "nice";
        String t = "niece";
        String expectedResult = "INSERT e";

        //When
        String actualResult = task3(s, t);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnSwapOrForWordform() {
        //Given
        String s = "form";
        String t = "from";
        String expectedResult = "SWAP o r";

        //When
        String actualResult = task3(s, t);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnImpossibleForWordoToOdd() {
        //Given
        String s = "o";
        String t = "odd";
        String expectedResult = "IMPOSSIBLE";

        //When
        String actualResult = task3(s, t);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnImpossibleForWordTarongaToToga() {
        //Given
        String s = "Taronga";
        String t = "Toga";
        String expectedResult = "IMPOSSIBLE";

        //When
        String actualResult = task3(s, t);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnInsertEForWordLeaseToPlease() {
        //Given
        String s = "lease";
        String t = "please";
        String expectedResult = "INSERT p";

        //When
        String actualResult = task3(s, t);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnInsertEForWordPleaseToLease() {
        //Given
        String s = "please";
        String t = "lease";
        String expectedResult = "DELETE p";

        //When
        String actualResult = task3(s, t);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnImpossibleForWordHiltToHill() {
        //Given
        String s = "please";
        String t = "lease";
        String expectedResult = "DELETE p";

        //When
        String actualResult = task3(s, t);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void  shouldReturn900CentsFor3Calls() {
        //Given
        String s = "00:01:07,400-234-090\n" +
                "00:05:01,701-080-080\n" +
                "00:05:00,400-234-090";
        int expectedResult = 900;

        //When
        int actualResult = solution(s);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void  shouldReturn201CentsFor1min7secondCall() {
        //Given
        String s = "00:01:07,701-080-080\n";
        int expectedResult = 201;

        //When
        int actualResult = solution(s);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void  shouldReturn750CentsFor5minCall() {
        //Given
        String s = "00:05:00,701-080-080\n";
        int expectedResult = 750;

        //When
        int actualResult = solution(s);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void  shouldReturn900CentsFor5minand1SecondCall() {
        //Given
        String s = "00:05:01,701-080-080\n";
        int expectedResult = 900;

        //When
        int actualResult = solution(s);

        //Then
        assertEquals(expectedResult, actualResult);
    }

}