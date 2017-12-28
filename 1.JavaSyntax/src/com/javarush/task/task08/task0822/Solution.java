package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {

        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = 0; i < number; i++) {
            list.add(scan.nextInt());
        }
        return list;
    }
}

