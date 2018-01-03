package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        ArrayList<String> list2 = new ArrayList<>();

        for (String x : list) {
            StringTokenizer st = new StringTokenizer(x, " \t\n\r,:-;");

            while (st.hasMoreTokens()) {
                list2.add(st.nextToken());
            }
        }

        for (String x : list2) {
            int cnt = 0;
            for (String j : list2) {
                if (x.equals(j))
                {
                    cnt++;
                }
            }
            result.put(x, cnt);
        }


        return result;
    }

}

