package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream read = new FileInputStream(file2);
        FileInputStream read1 = new FileInputStream(file1);
        FileOutputStream write = new FileOutputStream(file1);

        byte[] arr = new byte[read.available()];
        byte[] arr1 = new byte[read1.available()];

        read.read(arr);
        read1.read(arr1);

        write.write(arr);
        write.write(arr1);

        reader.close();
        read.close();
        read1.close();
        write.close();

    }
}
