package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read  = new BufferedReader(new InputStreamReader(System.in));
        String file = read.readLine();
        FileInputStream stream = new FileInputStream(file);

        HashMap<Integer, Integer> map  = new HashMap<>();
        int [] ar = new int[stream.available()];


        while (stream.available() > 0){
            int b = stream.read();
            ar[stream.available()] = b;
            map.put(b, 0);
        }

        stream.close();
        read.close();

        for ( Map.Entry<Integer, Integer> x : map.entrySet()) {
            int max = 0;
            for (int i = 0; i < ar.length; i++) {
                if (x.getKey() == ar[i]){
                    max++;
                }
            }
            x.setValue(max);
        }

        int maxVal = Collections.min(map.values());

        String print = "";


        for (Map.Entry<Integer, Integer> x : map.entrySet()) {

            if (maxVal == x.getValue()){
                print +=  x.getKey() + " ";
            }

        }

        System.out.println(print);

    }
}
