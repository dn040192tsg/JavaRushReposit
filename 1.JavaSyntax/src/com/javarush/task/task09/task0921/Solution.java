package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();

        try {
            while(true){
                list.add(scan.nextInt());
            }
        } catch (Exception e) {
            for (int x : list) {
                System.out.println(x);
            }
        }

    }
}