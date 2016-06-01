package com.codeforces.problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

/**
 * Created by HP-PK on 29.05.2016.
 */
public class TestProblem2A {

    private HashMap<String, Integer> testMap = new HashMap<String, Integer>();
    private String[] masTest = new String[] {"Roman 10", "Alex 5", "Roman 5", "Alex 10"};

    @Before
    public void generateData() {
//        testMap.put("Roman", 10);
//        testMap.put("Alex", 5);
//        testMap.put("Roman", 2);
//        testMap.put("Alex", 10);
    }

    @Test
    public void test() {
        Problem2A problem2A = new Problem2A();
        for(String str : masTest) {
            problem2A.gameHod(str);
        }
        assertTrue(problem2A.gameItog().equals("Alex"));
    }
}
