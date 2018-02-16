package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream stream = new FileInputStream(args[0]);
        int a = 0;
        int b = stream.available();


        int st = 0;

        while (stream.available() > 0) {
            st = stream.read();
            if (st == 32) {
                a++;
            }
        }
        System.out.printf("%.2f", (float)a/b * 100);

        stream.close();

    }
}
