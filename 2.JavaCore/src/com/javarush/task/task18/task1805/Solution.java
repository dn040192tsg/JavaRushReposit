package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read  = new BufferedReader(new InputStreamReader(System.in));
        String file = read.readLine();
        FileInputStream stream = new FileInputStream(file);

        TreeSet<Integer> map  = new TreeSet <>();


        while (stream.available() > 0){
            map.add(stream.read());
        }

        stream.close();
        read.close();


        for (int x : map) {
            System.out.print(x + " ");
        }



    }
}
