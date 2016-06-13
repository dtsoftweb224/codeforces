package com.codeforces.problem1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makarov Roman on 21.05.2016.
 */
public class TestProblem1B {

    @Test
    public void testProblem1B() {
        Problem1B problem1B = new Problem1B();
        assertEquals(problem1B.convertStr("R98C1364"), "AZL98"); // Проверен
//        assertEquals(problem1B.convertStr("R228C494"), "RZ228");
//        assertEquals(problem1B.convertStr("R23C55"), "BC23"); // Проверен
//        assertEquals(problem1B.convertStr("R23C27"), "AA23"); // Проверен
//        assertEquals(problem1B.convertStr("R901C910"), "AHZ901");
//        assertEquals(problem1B.convertStr("BC23"), "R23C55");
    }


}
