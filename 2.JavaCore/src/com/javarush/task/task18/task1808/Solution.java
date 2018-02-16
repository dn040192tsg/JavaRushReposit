package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        String f = reader.readLine();
        String f2 = reader.readLine();
        String f3 = reader.readLine();

        FileInputStream file = new FileInputStream(f);
        FileOutputStream file2 = new FileOutputStream(f2);
        FileOutputStream file3 = new FileOutputStream(f3);

        byte [] ar = null;
        byte [] ar2 = null;

        if (file.available() % 2 == 0){
            ar = new byte[file.available()/2];
            ar2 = new byte[file.available()/2];
        }else{
            ar = new byte[(file.available() + 1)/2];
            ar2 = new byte[ar.length - 1];
        }

        if (file.available() > 0){
            file.read(ar);
            file.read(ar2);
            file2.write(ar);
            file3.write(ar2);
        }

        reader.close();
        file.close();
        file2.close();
        file3.close();

    }
}
