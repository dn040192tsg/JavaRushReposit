package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream reader = new FileInputStream(args[0]);

        int count = 0;
        while (reader.available() > 0) {
            int t = reader.read();
            if (t > 64 && t < 91 || t > 96 && t < 123) {
                count++;
            }
        }
        reader.close();
        System.out.println(count);


    }
}
