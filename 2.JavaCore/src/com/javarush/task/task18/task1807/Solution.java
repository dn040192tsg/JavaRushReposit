package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        byte [] ar = new byte[file.available()];
        if (file.available() > 0){
           file.read(ar);
        }
        reader.close();
        file.close();

        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 44){
                count++;
            }
        }
        System.out.println(count);
    }
}
