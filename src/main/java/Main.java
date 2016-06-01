import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by HP-PK on 21.05.2016.
 */
public class Main {

    private static HashMap<String, Integer> gameResult = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        if (sc.hasNext()) {
            i = sc.nextInt();
        }
        // Проверка что не 0
        if (i > 0) {
            while (i > 0) {
                String strIn = sc.next();
                int b = sc.nextInt();
                gameHod(strIn + " " + b);
                i--;
            }
        }
        System.out.println(gameItog());
    }

    private static void gameHod(String hodRound) {

        String name = hodRound.substring(0, hodRound.indexOf(" "));
        Integer point = Integer.valueOf(hodRound.substring(hodRound.indexOf(" ") + 1));
        if (point > 0) {
            if (gameResult.containsKey(name)) {
                int a = gameResult.get(name);
                gameResult.put(name, a + point);
            } else {
                gameResult.put(name, point);
            }
        }
    }

    private static String gameItog() {
        Map.Entry<String,Integer> maxEntry = null;

        for(Map.Entry<String,Integer> entry : gameResult.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        return maxEntry.getKey();
    }
}
