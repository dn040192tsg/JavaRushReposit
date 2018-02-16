package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read  = new BufferedReader(new InputStreamReader(System.in));
        String file = read.readLine();
        FileInputStream stream = new FileInputStream(file);
        int min = 100000;
        while (stream.available() > 0){
            int b = stream.read();
            if (min > b){
                min = b;
            }
        }

        System.out.println(min);

        stream.close();

    }
    }

