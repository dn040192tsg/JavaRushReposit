package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        while (file.available() > 999){
            file = new FileInputStream(reader.readLine());
        }
        if (file.available() < 1000){
            reader.close();
            file.close();
            throw new DownloadException();
        }



    }

    public static class DownloadException extends Exception {

    }
}
