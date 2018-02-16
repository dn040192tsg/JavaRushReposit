package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileOutputStream write = new FileOutputStream(file1);
        FileInputStream read  = new FileInputStream(file2);
        FileInputStream read2  = new FileInputStream(file3);

        byte [] ar = new byte[read.available()];

        read.read(ar);
        write.write(ar);

        byte [] ar1 = new byte[read2.available()];

        read2.read(ar1);
        write.write(ar1);

        reader.close();
        write.close();
        read.close();
        read2.close();

    }
}
