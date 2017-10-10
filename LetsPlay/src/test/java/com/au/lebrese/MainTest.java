package com.au.lebrese;

import org.junit.jupiter.api.Test;

import static com.au.lebrese.Main.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturn600For15DaysOfWork() {
        //Given
        int expectedResult = 600;
        int daysWorked = 15;

        //When
        int actualResult = penny(daysWorked);

        //Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn333975For365DaysOfWork() {
        //Given
        int expectedResult = 333975;
        int daysWorked = 365;

        //When
        int actualResult = penny(daysWorked);

        //Then
        assertEquals(expectedResult, actualResult);
    }


}