package ru.netology;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackerTest {
    CashbackHacker service = new CashbackHacker();


   @Test
    public void shouldCalculateRest() {

        int actual = service.remain(650);
        int expected = 350;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRestAtBound() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateRestOutOfBound() {

        int actual = service.remain(1800);
        int expected = 200;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateWithNegative() {

        int actual = service.remain(-10);
        int expected = 1010;

        assertEquals(actual, expected);

    }


}