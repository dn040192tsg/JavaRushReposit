package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());

        byte[] ar = new byte[file.available()];

        if (file.available() > 0){
            file.read(ar);
            for (int i = 0; i < ar.length; i++) {
                file2.write(ar[ar.length - i - 1]);
            }
        }

        reader.close();
        file.close();
        file2.close();

    }
}
