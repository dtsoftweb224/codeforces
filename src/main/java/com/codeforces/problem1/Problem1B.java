package com.codeforces.problem1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Makarov Roman on 21.05.2016.
 */
public class Problem1B {

    private static final int maxIndex = 5;

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
                System.out.println(convertStr(strIn));
                i--;
            }
        }
    }

    public static String convertStr(String strIn) {

        int indR = strIn.indexOf("R");
        int indC = strIn.indexOf("C");
        if (indR != -1 && indC != -1 && indC - indR > 1) {
            /* Формат RxCy */
            return convertFromRC(strIn, indR, indC);
        } else {
            /* Формат BCxy */
            return convertInRC(strIn);
        }
    }

    /**
     * Преобразование из формата RxCy в формат Excel
     * @param strIn
     * @return
     */
    private static String convertFromRC(String strIn, int indexR, int indexC) {

        long row = Integer.valueOf(strIn.substring(indexR + 1, indexC));
        long col = Integer.valueOf(strIn.substring(indexC + 1, strIn.length()));
        int index = 0;

        if (col > 26) {
            StringBuilder strCol = new StringBuilder();

            if (Math.cbrt(col) > 0) {
                index = 3;
            } else {

            }
            // Формирование символьного представления
            while (index > 0) {

                index--;
            }
            return strCol.toString() + String.valueOf(row);
        } else {
            return (char)col + 64 + String.valueOf(row);
        }
    }

    /**
     * Преобразование из обычного формата Excel в RxCy
     * @param strIn
     * @return
     */
    private static String convertInRC(String strIn) {

        int a = 0;
        String col = "";
        String row = "";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcherStr = pattern.matcher(strIn);
        /* Номер строки */
        if(matcherStr.find()) {
            // Совпадаение найдено
            a = matcherStr.start();
            col = strIn.substring(0, a);
            row = strIn.substring(a);
        }

        int colNumber = 0;
        int index = col.length() - 1;
        for (int i = 0; i < col.length(); i++) {
            colNumber += ((int) col.charAt(index) - 64) * Math.pow(26, i);
            index--;
        }

        return "R" + row + "C" + colNumber;
    }

//    private static int searchMaxIndex(long n) {
//
//    }
}
