package com.codeforces.problem2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HP-PK on 29.05.2016.
 */
public class Problem2A {

    private HashMap<String, Integer> gameResult = new HashMap<String, Integer>();

    public void gameHod(String hodRound) {

        String name = hodRound.substring(0, hodRound.indexOf(" "));
        Integer point = Integer.valueOf(hodRound.substring(hodRound.indexOf(" ") + 1));
        if (gameResult.containsKey(name)) {
            int a = gameResult.get(name);
            gameResult.put(name, a + point);
        } else {
            gameResult.put(name, point);
        }
    }

    public String gameItog() {
        Map.Entry<String,Integer> maxEntry = null;

        for(Map.Entry<String,Integer> entry : gameResult.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        return maxEntry.getKey();
    }

}
