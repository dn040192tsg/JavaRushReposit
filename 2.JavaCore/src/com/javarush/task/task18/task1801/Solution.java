package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read  = new BufferedReader(new InputStreamReader(System.in));
        String file = read.readLine();
        FileInputStream stream = new FileInputStream(file);
        int max = 0;
        while (stream.available() > 0){
            int b = stream.read();
            if (max < b){
                max = b;
            }
        }

        System.out.println(max);

        stream.close();

    }
}
